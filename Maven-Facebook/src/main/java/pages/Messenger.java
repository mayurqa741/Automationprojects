package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messenger {
	
	@FindBy (xpath = "//a[text()='Rooms']")
	private WebElement rooms;
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement features;
	
	public Messenger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnRooms()
	{
		rooms.click();
	}
	
	public void clickOnFeatures()
	{
		features.click();
	}
	
	
	

}
