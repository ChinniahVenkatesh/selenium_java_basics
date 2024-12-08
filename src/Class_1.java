import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_1 {

	public static void main(String [] args) throws InterruptedException
	{
		
		//What is WebDriver?
		//webDriver is an interface which is allow us to communicate with browser -> searchContext 
		//What is the parent interface of selenium -> searchContext 
		//Chrome
		
		//To initialize a browser
		WebDriver driver = new EdgeDriver();
		JavascriptExecutor je ;
		
		//It's used to hit the url on browser -> get() -> WebDriver -> return type is void 
		//It will not store the browser history 
		//it will freshly launch the url on the webpage 
		
		driver.get("https://www.espncricinfo.com");
		je = (JavascriptExecutor) driver;
		je.executeScript("window.open()");
		Set<String> windowsOpen = driver.getWindowHandles();
		Iterator<String> i = windowsOpen.iterator();
		String parentWindow = i.next();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
			Thread.sleep(1000);
			driver.get("https://demo.automationtesting.in/Index.html");
			Thread.sleep(1000);
		}
		//driver.switchTo().window(parentWindow);
		
		//Locators -> 80% of selenium is done
		//id,class,Name,tagname,css,xpath,linkText,parcialLinkText 
		//What is locator -> It is used to locate the element of the webpage 
		
		//id -> This is a unique keyword  used in elements of the webpage so the first priority is given to id 
		//how to use id locator 
		//findElement -> It is used to find the element present in the webpage 
		//By -> By class is used to choose which type of locator your going to use.
		
		WebElement emailField = driver.findElement(By.id("email"));
		
		//How to pass the value in fields -> by using sendKeys -> WebElement -> return type is void 
		
		emailField.sendKeys("arun");
		String s1 = je.executeScript("return document.getElementById('email').value").toString();
		//Object s1 = je.executeScript("document.getElementById('email').value");
		Thread.sleep(1000);
		System.out.println(s1);
		
		
		//How to click the element of the webpage -> by using click() -> WebElement -> void 
		driver.findElement(By.className("btn-primary-outline")).click();
		
		
		
		
		
		
		// How to close the browser -> by using close() -> WebDriver -> return type is
		 //void //close() - will close the current tab
		 driver.close();
		/* * 
		 * //How to quit the entire browser -> by using quit() -> webDriver -> return
		 * type is void //quit() -> it will close the entire browser
		 * 
		 * //driver.quit();
		 	*/	
		
		
		
	
		
	}

}
