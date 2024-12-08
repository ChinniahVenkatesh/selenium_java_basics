import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class scrollElement {
	
	
	public static void main(String [] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement submit_button = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		JavascriptExecutor je =(JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView({behaviour:'smooth',inline:'center'});",submit_button);
		Thread.sleep(3000);
		je.executeScript("arguments[0].click();",submit_button);
		je.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",submit_button);
		WebElement choose_file = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		je.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",choose_file);
		choose_file.sendKeys("C:\\Users\\chinn\\Downloads\\OIP.jpg");
		
		
	}

}
