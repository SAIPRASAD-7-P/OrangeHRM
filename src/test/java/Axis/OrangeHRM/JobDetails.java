package Axis.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JobDetails {
	@SuppressWarnings("deprecation")
	@Test
	public void LoginPortal() {
	System.setProperty("Webdriver.chrome.driver",
	"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	    
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	 
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	 
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("admin123");
	 
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();

	}	
}