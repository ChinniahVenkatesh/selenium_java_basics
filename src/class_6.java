import java.io.IOException;
import java.net.URISyntaxException;

import org.openqa.selenium.edge.EdgeDriver;

public class class_6 extends utilities{

	public static  EdgeDriver driver;
	
	
	public static void main(String [] args) throws IOException, URISyntaxException
	{
		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		/*
		 * utils.ExtentReportsStart(class_6.class.getName());
		 * utils.sendKeysintheFieldText("//input[@ng-model='FirstName']", "Arun");
		 * utils.ExtentReportsEnd();
		 */
	}
}
