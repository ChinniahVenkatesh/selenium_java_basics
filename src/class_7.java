import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class class_7 extends utilities{
    
	public static EdgeDriver driver;
	public static void main(String [] args) throws IOException, InterruptedException
	{
		utilities test = new utilities();
		driver = test.initializeBrowser();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		test.getElement("greenkartSearchField").sendKeys("Tomato");
		test.getElement("//a[text()='Flight Booking']").click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 = windows.iterator();
		while(i1.hasNext())
		{
			driver.switchTo().window(i1.next());
		}
		//Thread.sleep(20000);
		System.out.println(test.getElement("autoSuggestdDropDown").isDisplayed());
		//Actions action = new Actions(driver);
		if(test.getElement("autoSuggestdDropDown").isDisplayed())
		{
			test.getElement("autoSuggestdDropDown").sendKeys("Ind");
			Thread.sleep(2000);
			List<WebElement> countryDropDown = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete')]/li/a"));
			for(int i = 0 ; i < countryDropDown.size(); i++)
			{
				if(countryDropDown.get(i).getText().equals("India"))
				{
					countryDropDown.get(i).click();
				}
			}
		}
		
		
		test.getElement("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']").click();
		Thread.sleep(2000);
		List<WebElement> countries = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//ul/li/a"));
		for(int i = 0 ; i < countries.size(); i++)
		{
			System.out.println(countries.get(i).getText());
			if(countries.get(i).getText().trim().startsWith("Chennai (MAA)"))
			{
				countries.get(i).click();
				Thread.sleep(1000);
				break;
			}
		}
		
		List<WebElement> countriesTo = test.getElements("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//div[@id='dropdownGroup1']//ul/li");
		for(int i = 0 ; i < countriesTo.size(); i++)
		{
			System.out.println(countriesTo.get(i).getText());
			if(countriesTo.get(i).getText().trim().startsWith("Goa (GOI)"))
			{
				countriesTo.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
		
		test.getElement("//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']/a[text()='12']").click();
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		List<WebElement> currencyOptions = select.getOptions();
		for(int i = 0 ; i < currencyOptions.size(); i++)
		{
			System.out.println(currencyOptions.get(i).getText());
			if(currencyOptions.get(i).getText().contains("USD"))
			{
				select.selectByVisibleText("USD");
				Thread.sleep(1000);
			}
		}
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("AED");
		
		System.out.println(select.getAllSelectedOptions().get(0).getText());
	}
}
