import java.util.Optional;


import org.openqa.selenium.devtools.DevTools;

import org.openqa.selenium.devtools.v128.network.Network;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.edge.EdgeDriver;


public class devToolsExample {

	public static void main(String [] args)
	{
		EdgeDriver driver = new EdgeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Emulation.setDeviceMetricsOverride(912, 1368, 80, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty()));
		driver.navigate().refresh();
		driver.get("https://www.espncricinfo.com");
	}
}



