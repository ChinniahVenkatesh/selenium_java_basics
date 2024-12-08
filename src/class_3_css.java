import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class class_3_css extends utilities{
	
	public static EdgeDriver driver;

	
	public static void main(String [] args) throws InterruptedException
	{
		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//css selector by using attribute name and value syntax tagname[attributename = 'attributevalue']
		//input[ng-model='FirstName']
		utils.highlighWebElement(utils.findWebElement("input[ng-model='FirstName']"));
		utils.findWebElement("input[ng-model='FirstName']").sendKeys("Dhoni");
		utils.findWebElement("input[ng-model='FirstName']").clear();
		utils.findWebElement("input[ng-model='FirstName']").sendKeys("Raina");
		utils.findWebElement("input[ng-model='LastName']").sendKeys("CSK");
		
		//css selector by using id = #idattribute value
		utils.findWebElement("#eid input").sendKeys("arunvenkatesh09@gmail.com");
		
		//css selector by using className = .classattributevalue
		String checkBoxText = utils.findWebElement(".checks").getText();
		System.out.println(checkBoxText);
		String AttributeValue = utils.findWebElement("#checkbox1").getAttribute("type");
		System.out.println(AttributeValue);
		
		utils.findWebElement("#checkbox1").click();
		System.out.println(utils.findWebElement("#checkbox1").isSelected());
		
	    driver.navigate().to("https://www.espn.in/cricket/series/22712/scorecard/1439891/india-vs-bangladesh-1st-test-bangladesh-in-india-2024-25");
	    Thread.sleep(3000);
	    if(utils.findWebElement("a[aria-controls='gp-inning-00']").getAttribute("class").contains("collapsed"))
	    {
	    	utils.findWebElement("a[aria-controls='gp-inning-00']").click();
	    }
	    else
	    {
	    	System.out.println("Already the innings accordian is opened");
	    }
		
	    
	    //css Selector by using text tagname:contains('text')
	    
	    driver.get("https://demo.automationtesting.in/Register.html");
	    System.out.println(utils.findWebElement("label:contains('Hobbies')").getText());
	    
	    
	}

}
