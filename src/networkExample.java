import java.util.Optional;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.edge.EdgeDriver;

public class networkExample {

	public static void main(String [] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devtools.addListener(Network.responseReceived(), responseReceived -> 
		{
			if(responseReceived.getResponse().getUrl().equals("https://www.espncricinfo.com/"))
		{
			System.out.println(responseReceived.getResponse().getUrl());
			System.out.println(responseReceived.getResponse().getStatus());
		}
		});
		driver.get("https://www.espncricinfo.com");
		Thread.sleep(10000);
	}
}
