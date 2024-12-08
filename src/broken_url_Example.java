import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.edge.EdgeDriver;

public class broken_url_Example {

	public static void main(String [] args) throws MalformedURLException, IOException
	{

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://demoqa.com/links");
		HttpsURLConnection connection = (HttpsURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/500").openConnection();
		connection.connect();
		System.out.println(connection.getResponseCode());
		
	}
}
