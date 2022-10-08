package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginOrSignup;
import pages.Messenger;
import pages.RoomsPage;

public class VerifyTheHelpCenter {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MAYUR PATIL\\Desktop\\Software Testing"
				+ "\\Automation notes\\Browser exe files for automation"
				+ "\\Chrome Exe driver file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginOrSignup loginOrSignup = 
				new LoginOrSignup (driver);
		
		loginOrSignup.openMessenger();
		
		Messenger messenger = new Messenger(driver);
		
		messenger.clickOnRooms();
		
		RoomsPage roomsPage = new RoomsPage(driver);
		
		roomsPage.clickOnHelpCenter();
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.messenger.com/help") 
				&& title.equals("Messenger Help Centre"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	
		
		
	}

}
