import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {
	
	public static void main(String [] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		FluentWait wait = new FluentWait(driver);
		driver.get("https://www.espncricinfo.com");
		wait.withTimeout(Duration.ofSeconds(20000))
		.pollingEvery(Duration.ofSeconds(500)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='wzrk-cancel']")));
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	}

}
