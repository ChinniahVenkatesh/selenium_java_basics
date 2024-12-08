import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class pageLinks {

	public static void main(String [] args) throws MalformedURLException, IOException, InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		String pageUrl;
		int TotalUrl;
		int passCount = 0;
		int failcount = 0;
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(10000);
		List<WebElement> urls = driver.findElements(By.xpath("//a"));
		TotalUrl = urls.size();

			for(WebElement url : urls)
			{

				pageUrl = url.getAttribute("href");	
				HttpsURLConnection connection = (HttpsURLConnection) new URL(pageUrl).openConnection();
				connection.connect();
				if(connection.getResponseCode() == 200)
				{
					System.out.println("The page url is "+pageUrl+" "+"Status code is "+connection.getResponseCode());
					passCount = passCount+1;
				}
				else
				{
					System.out.println("The page url is "+pageUrl+" "+"Status code is "+connection.getResponseCode());
					failcount = failcount+1;
				}
			}
		
		System.out.println("Total URL Count is "+TotalUrl);
		System.out.println("Total URL PassCount Count is "+passCount);
		System.out.println("Total URL FailCount Count is "+failcount);
	}
}

