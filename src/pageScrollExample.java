import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pageScrollExample {

	public static void main(String [] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		JavascriptExecutor je = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/team/pakistan-7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		List<WebElement> newsCount = driver.findElements(By.xpath("//div[@class='feed']/div[1]/div"));
		//int contentCount  = 10;
		int iteractionCount = 1;
		System.out.println(newsCount.size());
		for(int i = 0 ; i < newsCount.size(); i++)
		{
			if(i / (iteractionCount * 10) == 1)
			{
				je.executeScript("arguments[0].scrollIntoView();",newsCount.get(i));
				je.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;')",newsCount.get(i));
				Thread.sleep(30000);
				newsCount = driver.findElements(By.xpath("//div[@class='feed']/div[1]/div"));
				System.out.println(newsCount.size());
				i = i + 1;
				iteractionCount = iteractionCount + 1;
				System.out.println(iteractionCount);
			}
		}
	}
}
