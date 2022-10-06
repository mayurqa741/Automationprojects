package pack1;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.PractisePage;

public class VerifyTheSeleniumPage {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\MAYUR PATIL\\Desktop\\Software Testing\\Automation notes\\Browser exe files for automation"
			+ "\\Chrome Exe driver file\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://vctcpune.com/");
	
	driver.manage().window().maximize();
	
	HomePage homePage = new HomePage(driver);
	
	homePage.clickOnPractiseButton();
	
	ArrayList <String> add = new ArrayList <String>(driver.getWindowHandles());
	
	String add1 = add.get(1);
	
	driver.switchTo().window(add1);
	
	PractisePage practisePage = new PractisePage(driver);
	
	boolean result =practisePage.
			clickAndVerifyTheRadioButton();
	
	if (result == true)
	{
		System.out.println("RADIO = PASS");
	}
	else
	{
		System.out.println("RADIO = FAIL");
	}
	
	practisePage.sendInCountryBox();
	
	practisePage.selectOptionFromDropdown();
	
	result = practisePage.clickAndVerifyTheTickBox();
	
	if (result == true)
	{
		System.out.println("TICK BOX = PASS");
	}
	else
	{
		System.out.println("TICK BOX = FAIL");
	}
	
	practisePage.clickOnOpenTab();
	
	ArrayList <String > addr= new ArrayList<String>(driver.getWindowHandles());
	
	String add2 = addr.get(2);
	
	String add3 = addr.get(1);
	
	driver.switchTo().window(add2);
	
	driver.close();
	
	driver.switchTo().window(add3);
	
	practisePage.sendIntoEntername();
	
	practisePage.clickOnAlertButton();
	
	Alert alt = driver.switchTo().alert();
	
	alt.accept();
	
	result =practisePage.checkIsDisplayedElement();
	
	if (result == true)
	{
		System.out.println("IS DISPLAYED = PASS");
	}
	else
	{
		System.out.println("IS DISPLAYED = FAIL");
	}
	
	practisePage.checkMouseHover();
	
	practisePage.sendIntoDistrict();
	
	practisePage.sendIntoDate();
	
	
}


}
