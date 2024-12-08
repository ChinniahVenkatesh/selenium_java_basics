import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class class_8 extends utilities{

	static EdgeDriver driver;
	public static void main(String [] args)
	{

		utilities utils = new utilities();
		
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> radioOptions =
		driver.findElements(By.xpath("//input[@type='radio']/parent::label"));
		List<WebElement> radioButton =
		driver.findElements(By.xpath("//input[@type='radio']")); 
		for(int i = 0 ; i <radioButton.size(); i++) 
		{ 
			System.out.println(radioOptions.get(i));
			if(radioOptions.get(i).getText().trim().equals("Male")) 
			{
			radioButton.get(i).click(); 
			} 
		}
		
		List<WebElement> checkBoxLabel =
		driver.findElements(By.xpath("//input[@type='checkbox']")); 
		for(int i = 0 ; i< checkBoxLabel.size(); i++)
		{
			if(checkBoxLabel.get(i).getAttribute("value").contains("Movies")) 
			{
				checkBoxLabel.get(i).click();
			}
		}

	
		String Text = " Dhoni ";
		//Text = Text.trim();
		System.out.println(Text+"is my captain");
		
		ArrayList<String> trimText = new ArrayList<String>();
		trimText.add(Text);
		
		trimText.get(0).length();
		String trimedTextEnd = ""+trimText.get(0).subSequence(0,trimText.get(0).length()-1);
		System.out.println(trimedTextEnd+"is my captain");
		//window.scroll(0,1000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//multi-select/div[1]")));
		driver.findElement(By.xpath("//multi-select/div[1]")).click();
		List<WebElement> languageOptions = driver.findElements(By.xpath("//multi-select/div[2]/ul/li/a"));
		for(int i = 0 ; i < languageOptions.size(); i++)
		{
			System.out.println(languageOptions.get(i).getText());
			if(languageOptions.get(i).getText().contains("English") ||languageOptions.get(i).getText().contains("French"))
			{
				languageOptions.get(i).click();
			}
		}
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		je.executeScript("arguments[0].value='Arun';", driver.findElement(By.xpath("//input[@placeholder='First Name']")));
		String value = (String) je.executeScript("return arguments[0].value", driver.findElement(By.xpath("//input[@placeholder='First Name']")));
		System.out.println(value);
		
		je.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[@id='submitbtn']")));
	}
}
