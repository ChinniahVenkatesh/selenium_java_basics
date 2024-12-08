import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class table_Example extends utilities{

	public static EdgeDriver driver;
	public static void main(String [] args) throws InterruptedException
	{
		utilities utils = new utilities();
		driver = utils.initializeBrowser();
		driver.get("https://www.espncricinfo.com/series/icc-women-s-t20-world-cup-2024-25-1432420/points-table-standings");
		Thread.sleep(20000);
		if(driver.findElement(By.xpath("//button[text()='Not Now']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		}
		List<WebElement> tableTeamNames = driver.findElements(By.xpath("//div[@class='ds-mb-4']/div/div[2]/table/tbody/tr/td[1]/a/div/span"));
		for(WebElement tableTeamName : tableTeamNames)
		{
			System.out.println(tableTeamName.getText());
		}
		
		String element = getStringElementReplace("//div[@class='ds-mb-4']/div/div[2]/table/tbody/tr/td[1]/a/div/span[text()='?']","India Women");
		System.out.println(driver.findElement(By.xpath(element)).isDisplayed());
	
	}
	
	public static String getStringElementReplace(String text, String replaceText)
	{
		ArrayList<String> stringText = new ArrayList<String>();
		stringText.add(text);
		String replacedText = stringText.get(0).replace("?", replaceText);
		System.out.println(replacedText);
		return replacedText;
	}
}
