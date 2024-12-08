import java.util.Optional;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;
import org.openqa.selenium.edge.EdgeDriver;

public class deviceOverRide {

	EdgeDriver driver;
	public EdgeDriver ExtraLarge()
	{
		driver = new EdgeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Emulation.setDeviceMetricsOverride(1024, 990, 80, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty()));
		driver.navigate().refresh();
		driver.get("https://www.espncricinfo.com");
		return driver;
	}
	
	public EdgeDriver Medium()
	{
		driver = new EdgeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Emulation.setDeviceMetricsOverride(770, 600, 80, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),Optional.empty(), Optional.empty(), Optional.empty()));
		driver.navigate().refresh();
		driver.get("https://www.espncricinfo.com");
		return driver;
	}
}
