package Main;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class utilities{

	public static EdgeDriver driver;
	public JavascriptExecutor je;
	public Properties prop;
	public FileInputStream fis;
	
	
	public EdgeDriver initializeBrowser()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		EdgeOptions options = new EdgeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities(options);
		
		System.out.println(options.getBrowserName());
		System.out.println(capabilities.getBrowserVersion());
		return driver;
	
	}
	/*
	 * This method returns the web element of the web page using css Selector
	 * This method returns null when there is no element on the webpage
	 * This method accepts string as a locator to locate the element in the webpage
	 */
	public WebElement findWebElement(String locator)
	{
		WebElement element = null;
		if(locator.startsWith("//"))
		{
			element = driver.findElement(By.xpath(locator));
		}
		else
		{
			element = driver.findElement(By.cssSelector(locator));
		}
		return element;
	}
	
	public void highlighWebElement(WebElement WebpageElement)
	{
		
		je = (JavascriptExecutor) driver;
	    je.executeScript("arguments[0].setAttribute('style','background:yellow');", WebpageElement);
	   
	}
	
	public void sendKeysintheFieldText(String locator, String value)
	{
	  WebElement element = findWebElement(locator);
	  element.sendKeys(value);
	  
	}
	
	public void clearFieldText(String locator)
	{
		WebElement element = findWebElement(locator);
		  element.clear();

	}
	
	public WebElement getElement(String element) throws IOException
	{
		String path = System.getProperty("user.dir")+"//src//Object//xpath.properties";
		WebElement webElement = null;
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		if(element.startsWith("//"))
		{
			webElement = driver.findElement(By.xpath(element));
		}
		else
		{
			element = prop.getProperty(element);
			if(element!= null)
			{
				webElement = driver.findElement(By.xpath(element));
			}
		}
		
		System.out.println(element);
		return webElement;
		
	}
	
	public List<WebElement> getElements(String element) throws IOException
	{
		String path = System.getProperty("user.dir")+"//src//Object//xpath.properties";
		List<WebElement> webElement = null;
		prop = new Properties();
		fis = new FileInputStream(path);
		prop.load(fis);
		if(element.startsWith("//"))
		{
			webElement = driver.findElements(By.xpath(element));
		}
		else
		{
			element = prop.getProperty(element);
			if(element!= null)
			{
				webElement = driver.findElements(By.xpath(element));
			}
		}
		
		System.out.println(element);
		return webElement;
		
	}
	
	public  void Screenshot() throws IOException
	{
		Date d = new Date();
		
		String path = System.getProperty("user.dir")+"//screenshot//"+d.getTime()+".jpg";
		File File = new File(path);
		FileInputStream fis;
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, File);

	}
	
}
