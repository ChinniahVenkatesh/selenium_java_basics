import org.openqa.selenium.edge.EdgeDriver;

public class Test01 extends deviceOverRide{
	
	static EdgeDriver driver;
	public static void main(String [] args)
	{
		deviceOverRide ov = new deviceOverRide();
		driver = ov.Medium();
	}

}
