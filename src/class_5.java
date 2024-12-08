import org.openqa.selenium.edge.EdgeDriver;

public class class_5 extends utilities{

	
	//xpath
	public static EdgeDriver driver;
	
	public static void main(String [] args)
	{
	
		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		System.out.println(utils.findWebElement("//div[@id='eid']").isEnabled());
		utils.sendKeysintheFieldText("//input[@ng-model='EmailAdress']", "arunvenkatesh028@gmail.com");
	    
		
		//absolute xpath 
		utils.clearFieldText("//form[@id='basicBootstrapForm']/div[3]/div/input");
		utils.sendKeysintheFieldText("//form[@id='basicBootstrapForm']/div[3]/div/input", "12345");
		
		
		
	}
}
