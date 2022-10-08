package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignup {
	
	@FindBy (xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='pass']")
	private WebElement pass;
	
	@FindBy (xpath = "//button[text()='Log In']")
	private WebElement loginbutton;
	
	@FindBy (xpath ="//a[text()='Create New Account']")
	private WebElement createnewacc;
	
	@FindBy (xpath = "//a[text()='Messenger']")
	private WebElement messenger;
	
	public LoginOrSignup (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void sendEmail(String user)
	{
		email.sendKeys(user);
	}
	
	public void sendPassword(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	
	public void clickOnCreateNewAccount()
	{
		createnewacc.click();
	}
	
	public void openMessenger()
	{
		messenger.click();
	}
	
	//or 
	
	public void loginToFacebook()
	{
		email.sendKeys("test@gmail.com");
		pass.sendKeys("tester@123");
		loginbutton.click();
		
	}
	

}
