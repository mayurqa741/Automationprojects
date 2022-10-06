package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath ="//a[text()='Click to Start "
			+ "Selenium Practice Now']" )
	private WebElement practisebutton;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickOnPractiseButton()
	{
		practisebutton.click();
	}

}
