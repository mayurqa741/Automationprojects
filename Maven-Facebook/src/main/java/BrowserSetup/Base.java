package BrowserSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MAYUR PATIL\\Desktop\\Software Testing"
				+ "\\Automation notes\\Browser exe files for automation"
				+ "\\Chrome Exe driver file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MAYUR PATIL\\Desktop\\"
				+ "Software Testing\\Automation notes"
				+ "\\Browser exe files for automation\\firefox exe"
				+ " driver file\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	}
	

}
