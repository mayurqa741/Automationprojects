package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PractisePage {
	
	WebDriver driver;
	Select s;
	Actions act;
	
	
	
	@FindBy (xpath ="//input[@value='Radio3']" )
	private WebElement radio3;
	
	@FindBy (xpath = "//input[@id='autocomplete']")
	private WebElement countrybox;
	
	@FindBy (xpath = "//select[@id='dropdown-class-example']")
	private WebElement dropdown;
	
	@FindBy (xpath = "//input[@id='checkBoxOption1']")
	private WebElement tickbox;
	
	@FindBy (xpath = "//a[@id='opentab']")
	private WebElement opentab;
	
	@FindBy (xpath = "//input[@id='name']")
	private WebElement entername;
	
	@FindBy (xpath = "//input[@id='alertbtn']")
	private WebElement alertbutton;
	
	@FindBy (xpath = "//input[@id='displayed-text']")
	private WebElement isdisplayed;
	
	@FindBy (xpath = "//table//tr//td")
	private List <WebElement> table;  
	
	@FindBy (xpath = "//button[@id='mousehover']")
	private WebElement mousehover;
	
	@FindBy (xpath = "//input[@placeholder="
			+ "'select your district']")
	private WebElement district;
	
	@FindBy (xpath = "//input[@placeholder='select date...']")
	private WebElement date;
	
	public PractisePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		s = new Select (dropdown);
		act = new Actions(driver);
		
	}
	
	public boolean clickAndVerifyTheRadioButton()
	{
		radio3.click();
		boolean result = radio3.isSelected();
		return result;
		
	}
	
	public void sendInCountryBox() 
	{
		countrybox.sendKeys("India");
		
		
		
	}
	
	public void selectOptionFromDropdown()
	{
		s.selectByVisibleText("Option3");		
	}
	
	public boolean clickAndVerifyTheTickBox()
	{
		tickbox.click();
		boolean result = tickbox.isSelected();
		return result;
	}
	
	public void clickOnOpenTab()
	{
		opentab.click();
	}
	
	public void sendIntoEntername()
	{
		entername.sendKeys("Mayur");
	}
	
	public void clickOnAlertButton()
	{
		alertbutton.click();
		
	}
	
	public boolean checkIsDisplayedElement()
	{
		boolean result = isdisplayed.isDisplayed();
		return result;
	}
	
	public void verifyTheTableData()
	{
		for (int i = 0 ; i < table.size(); i++)
		{
			System.out.println(table.get(i).getText() + " ,");
			
		}
	}
	
	public void checkMouseHover()
	{
		act.moveToElement(mousehover).perform();
	}
	
	public void sendIntoDistrict()
	{
		district.sendKeys("Nanded");
	}
	
	public void sendIntoDate()
	{
		date.sendKeys("31/03/1998");
	}
	

}
