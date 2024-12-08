import org.openqa.selenium.edge.EdgeDriver;

public class class_4 extends utilities{
	

	public static EdgeDriver driver;
	public static void main(String [] args) throws InterruptedException
	{
	
	String path = System.getProperty("user.dir")+"//index.html";

		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.manage().window().maximize();
		driver.get("https://www.espn.in/cricket/series/22712/scorecard/1439891/india-vs-bangladesh-1st-test-bangladesh-in-india-2024-25");
		Thread.sleep(1000);
		if(utils.findWebElement("a[aria-controls='gp-inning-00']").getAttribute("aria-expanded").contains("false"))
		{
			utils.highlighWebElement(utils.findWebElement("a[aria-controls='gp-inning-00']"));
			utils.findWebElement("a[aria-controls='gp-inning-00']").click();
		
		}
		else
		{
			System.out.println("Already the accordian is expanded so "+utils.findWebElement("a[aria-controls='gp-inning-00']").getAttribute("aria-expanded"));
		}
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		utils.findWebElement("input[ng-model$='Adress']").sendKeys("Chennai");
		
		utils.findWebElement("input[ng-model$='Adress'] or div[id='eid']").clear();
		
	}

}
