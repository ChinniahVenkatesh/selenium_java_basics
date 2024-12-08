package ReportsExample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.model.Media;

import Main.utilities;

public class commonMethods extends utilities{
	
	ReportsTest reports1;
	ExtentReports reports;
	ExtentTest test;
	public  EdgeDriver driver;
	public EdgeDriver startTest()
	{
		driver=initializeBrowser();
		reports1 = new ReportsTest();
		reports = reports1.startReport();
		return driver;
	}
	
	public ExtentTest createTest1(String name)
	{
		reports1 = new ReportsTest();
		test = reports1.createTestR(reports, name);
		return test;
	}
	public void ExtentScreenshot(EdgeDriver driver, ExtentTest tes) throws IOException
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		String path = System.getProperty("user.dir")+"//screenshot//"+sdf.format(d)+".jpg";
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File desFile = new File(path);
		FileUtils.copyFile(srcFile, desFile);
		tes.addScreenCaptureFromPath(path);
	}
	
	public void stopTest()
	{
		driver.quit();
		reports1.StopReport(reports);
	}
	
	public WebElement findWebElement(String locator)
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		String path = System.getProperty("user.dir")+"//screenshot//"+sdf.format(d)+".jpg";
		WebElement element = null;
		if(locator.startsWith("//"))
		{
			element = driver.findElement(By.xpath(locator));
		}
		else
		{
			element = driver.findElement(By.cssSelector(locator));
		}
		test.log(Status.INFO,"The Element is"+element,MediaEntityBuilder.createScreenCaptureFromPath(path).build());

		//test.log(Status.INFO, ,Media.MediaType.valueOf(path));
		
		try {
			ExtentScreenshot(driver,test);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return element;
		
	}
	
	
}
