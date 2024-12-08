import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class homeTest {

	EdgeOptions options ;

	public static void main(String [] args) throws IOException, URISyntaxException
	{
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		objectsExample oe = new objectsExample(driver);
		oe.firstNameField().sendKeys("Arun");
		System.out.println("Test is finished");
		HttpURLConnection connection = (HttpURLConnection) new URI("https://demo.automationtesting.in/Register.html").toURL().openConnection();
		connection.connect();
		System.out.println(connection.getResponseCode());
		
	}
}
