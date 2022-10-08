package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BrowserSetup.Base;
import pages.LoginOrSignup;
import pages.Messenger;
import pages.RoomsPage;
import utils.Utility;

public class testNg extends Base{
	
	WebDriver driver;
	LoginOrSignup loginOrSignup;
	Messenger messenger;
	RoomsPage roomsPage;
	private int testId;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browsername) {
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browsername.equals("Chrome"))
		{	
			driver = openChromeBrowser();
		}
		
		if(browsername.equals("Firefox"))
		{
			driver = openFirefoxBrowser();
		}
	}
	
	@BeforeClass
	public void createPOMClassObjects()
	{
		 loginOrSignup =new LoginOrSignup (driver);
		 messenger = new Messenger(driver);
		 roomsPage = new RoomsPage(driver);
		
		
	}
	
	@BeforeMethod
	public void roomsPage()
	{
		driver.get("https://www.facebook.com/");
		loginOrSignup.openMessenger();
		messenger.clickOnRooms();
	}
	
	@Test (enabled = false)
	public void checkTheLogin() throws EncryptedDocumentException, IOException
	{
		String dataa =Utility.takeExcelData("logindetails",1,1);
		loginOrSignup.sendEmail(dataa);
		
		dataa = Utility.takeExcelData("logindetails",1,0);
		loginOrSignup.sendPassword(dataa);
		
		
		
		
	}
	
	@Test 
	public void verifyTheHelpCenter()
	{
		testId = 1101;
		
		roomsPage.clickOnHelpCenter();
		
		String title = driver.getTitle();
		
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title,"Messenger Help Centre","title is wrong");
		Assert.assertEquals(url,"https://www.messenger.com/help");
		
	}
	
	@Test
	public void verifyTheReturnToMessengerButton()
	{
		testId = 2201;
		roomsPage.clickOnReturnToMessanger();
		
		String url = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		
		Assert.assertEquals(url,"https://www.messenger.com/","url is wrong");
		
		Assert.assertEquals(title, "Messenger","title is wrong");
		
		
	}
	
	@AfterMethod
	public void logOut(ITestResult result ) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver,testId);
		}
		System.out.println("log out");
	}
	
	@AfterClass
	public void removeObjects()
	{
		 loginOrSignup = null;
		 messenger = null;
		 roomsPage = null;
		
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.quit();
		driver = null;
		System.gc();
	}
	
	

}
