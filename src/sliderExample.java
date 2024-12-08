import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderExample {
	
	
	public static void main(String [] args)
	{
		/*
		 * EdgeDriver driver = new EdgeDriver();
		 * driver.get("https://demo.automationtesting.in/Slider.html");
		 * driver.manage().window().maximize(); Actions a = new Actions(driver);
		 * //a.dragAndDrop(driver.findElement(By.xpath("//div[@id='slider']/a")),driver.
		 * findElement(By.xpath("//div[@id='slider']/a[@style='left: 4%;']"))).build().
		 * perform();
		 * a.clickAndHold(driver.findElement(By.xpath("//div[@id='slider']/a")));
		 * a.moveByOffset(100,0); a.build().perform(); a.release();
		 */
	    Date d = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyyMM_mm_ss");
	    System.out.println(sdf.format(d)+".jpg");
	    

	}

}
