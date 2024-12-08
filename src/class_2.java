import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class class_2 {

	public static  WebDriver driver;
	static JavascriptExecutor je;
	public static void main(String [] args) throws InterruptedException
	{
		driver = new EdgeDriver();
		/*
		 * driver.get("https://demo.automationtesting.in/Register.html");
		 * driver.findElement(By.name("signup")).click();
		 * driver.findElement(By.tagName("input")).sendKeys("test");
		 * Thread.sleep(10000); driver.findElement(By.tagName("input")).clear();
		 * driver.findElement(By.linkText("WebTable")).click();
		 * driver.findElement(By.partialLinkText("Practice")).click();
		 * 
		 * driver.navigate().back(); driver.navigate().back();
		 * 
		 * if(driver.getCurrentUrl().contains("Register.html")) { boolean
		 * checkChooseFile = driver.findElement(By.id("imagesrc")).isDisplayed();
		 * System.out.println(checkChooseFile); } else {
		 * System.out.println("It's not navigated to home-page"); }
		 */

		
		driver.get("https://x.com/?lang=en-in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * je = (JavascriptExecutor) driver; je.executeScript(null, args);
		 */
		driver.findElement(By.xpath("//*[@data-testid='signupButton']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//button[@data-testid='ocfSignupNextLink']")).isEnabled());
		driver.close();
	}
}
