package pack1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PractisePage;

public class TestNg {
	
	WebDriver driver ;
	HomePage homePage ;
	PractisePage practisePage;
	
	@BeforeClass
	public void launchTheBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MAYUR PATIL\\Desktop\\Software Testing\\Automation notes\\Browser exe files for automation"
				+ "\\Chrome Exe driver file\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		
	}
	
	@BeforeMethod
	public void openPractisePage()
	{
		driver.get("https://vctcpune.com/");
		
		driver.manage().window().maximize();
		
		homePage = new HomePage(driver);
		
		homePage.clickOnPractiseButton();
		
		ArrayList <String> add = new ArrayList <String>(driver.getWindowHandles());
		
		String add1 = add.get(1);
		
		driver.switchTo().window(add1);
		
		practisePage = new PractisePage(driver);
		
	}
	
	@Test
	public void verifyTheRadioButtont()
	{
		boolean result =practisePage.
				clickAndVerifyTheRadioButton();
		
		Assert.assertTrue(result);
		
	}
	
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("LOG OUT");
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	

}
