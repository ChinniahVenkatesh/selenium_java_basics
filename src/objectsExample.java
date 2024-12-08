import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectsExample {

	public EdgeDriver driver;
	
	public objectsExample(EdgeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	WebElement firstName;
	
	public WebElement firstNameField()
	{
		return firstName;
	}
	

}
