import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class screenshotExample {

	public static void main(String [] args) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:mm:yyyy");
		String path = System.getProperty("user.dir")+"//screenshot//"+sdf.format(d)+".jpg";
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com");
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File desFile = new File(path);
		FileUtils.copyFile(srcFile, desFile);
		
	}
}
