import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class window_exaple extends utilities {
	
	static EdgeDriver driver;

	public static void main(String [] args)
	{
		utilities utils = new utilities();
		
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown']/a[text()='SwitchTo']/following-sibling::i")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li/a[text()='Windows']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator<String> i = windows.iterator();
		String parentWindow = i.next();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
		}
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> newWindow = driver.getWindowHandles();
		System.out.println(newWindow.size());
		Iterator<String> i2 = newWindow.iterator();
		while(i2.hasNext())
		{
			driver.switchTo().window(i2.next());
		}
		System.out.println(driver.getTitle());
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.espncricinfo.com");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.espn.in/cricket");
			System.out.println(driver.getTitle());
			
			Set<String> windows2 = driver.getWindowHandles();
			String requiredWindow="";
			Iterator<String> iterator = windows2.iterator();
			while(iterator.hasNext())
			{
				driver.switchTo().window(iterator.next());
				if(driver.getTitle().contains("Selenium"))
				{
					requiredWindow = iterator.next();
				}
			}
			System.out.println(driver.getTitle());
			driver.switchTo().window(requiredWindow);
			System.out.println(driver.getTitle());
	}
}
