package pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mock {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MAYUR PATIL\\Desktop\\Software Testing\\Automation notes\\Browser exe files for automation\\Chrome Exe driver file\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://zoom.us/");
		
		
		
		WebElement signup = driver.findElement(By.xpath("(//a[@href='https://zoom.us/signup'])[1]"));
		
		signup.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement month  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='select-0']")));
		
		month.click();
		
		WebElement july = driver.findElement(By.xpath("//dd[@aria-label='Dec']"));
		
		july.click();
		
		WebElement day = driver.findElement(By.xpath("//span[@id='select-1']"));
		
		day.click();
		
		WebElement seven = driver.findElement(By.xpath("//dd[@id='select-item-select-1-6']"));
		
		seven.click();
		
		WebElement year = driver.findElement(By.xpath("//span[@id='select-2']"));
		
		year.click();
		
		WebElement selectyear  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//dd[@id='select-item-select-2-5']")));
		
		selectyear.click();
		
		WebElement continuee = driver.findElement(By.xpath("//span[text()='Continue']"));
		
		continuee.click();
		
		String url =driver.getCurrentUrl();
		
		if(url.equals("https://zoom.us/signup"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
		
	}

}
