import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseinteraction {
	
	//When stale element and element click intercepted exception throws then use this concept
	public static void main(String [] args) throws AWTException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement interaction = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		Actions action = new Actions(driver);
		action.moveToElement(interaction).build().perform();
		action.click(driver.findElement(By.xpath("//a[text()='Drag and Drop ']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Static ']")).click();
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='dragarea']//img[@src='logo.png']")), driver.findElement(By.xpath("//div[@id='droparea']")))
		.build().perform();
		action.contextClick(driver.findElement(By.xpath("//div[@id='dragarea']//img[@src='logo.png']"))).build().perform();
		action.keyDown(Keys.ARROW_DOWN);
		action.keyDown(Keys.ARROW_DOWN);
		action.sendKeys(Keys.ENTER);
		action.release();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
