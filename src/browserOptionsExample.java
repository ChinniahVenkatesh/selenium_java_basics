import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class browserOptionsExample {
	
	public static void main(String [] args)
	{
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless");
		options.setPageLoadTimeout(Duration.ofSeconds(500000));
		EdgeDriver driver = new EdgeDriver(options);
		//System.out.println(options.getCapability("UserName"));
		driver.get("https://www.espncricinfo.com");
		System.out.println(driver.getTitle());
	
	}

}
