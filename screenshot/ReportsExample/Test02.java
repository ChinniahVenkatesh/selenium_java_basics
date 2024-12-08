package ReportsExample;

import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Test02 {

	public static EdgeDriver driver;
	public static void main(String [] args) throws InterruptedException
	{
		commonMethods common = new commonMethods();
		ReportsTest test = new ReportsTest();
		ExtentTest Test;
		driver = common.startTest();
		driver.get("https://www.espncricinfo.com");
		System.err.println(Test02.class.getName());
		Test= common.createTest1(Test02.class.getName());
		Test.log(Status.INFO,"Navigate to the url https://www.espncricinfo.com");
		Test.log(Status.PASS,"It's navigated");
		Test.log(Status.INFO,"Going to close the browser");
		Thread.sleep(20000);
		common.findWebElement("//button[text()='Not Now']").click();
		common.stopTest();
		
	}

}
