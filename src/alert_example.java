import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class alert_example extends utilities{

	 static EdgeDriver driver;
	
	public static void main(String [] args) throws InterruptedException
	{
		utilities utils = new utilities();
		
		driver = utils.initializeBrowser();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown']/a[text()='SwitchTo']/following-sibling::i")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li/a[text()='Alerts']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		driver.findElement(By.xpath("//div[@class='tabpane pullleft']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("testing");
		driver.switchTo().defaultContent();
		
		
		
		
	
	}
}
