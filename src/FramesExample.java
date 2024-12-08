import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesExample extends utilities{

	public static EdgeDriver driver;
	public static void main(String [] args)
	{
		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		driver.findElement(By.xpath("//input")).sendKeys("arun");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//li/a[text()='Iframe with in an Iframe']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='Multiple']/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input")).sendKeys("arun");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
}
