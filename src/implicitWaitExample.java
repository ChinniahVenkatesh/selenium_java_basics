import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitWaitExample {
	
	/*
	 * This wait is a universal wait we pass argument as duration.
	 * *
	 */
	public static void main(String [] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		
	}

}
