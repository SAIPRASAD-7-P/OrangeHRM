package Axis.OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class HRMLogin {
	static WebDriver driver;
@SuppressWarnings("deprecation")
@Test
public void LOGIN() {
	  // System.setProperty("Webdriver.chrome.driver",
	  // "C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");

	System.setProperty("Webdriver.edge.driver",
	"C:\\Users\\HP\\Documents\\Manipal\\edgedriver-win64\\edgedriver.exe");
	
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));

		Actions builder = new Actions(driver);

		org.openqa.selenium.interactions.Action seriesofact = builder.moveToElement(username).click()
				.keyDown(username, Keys.INSERT).sendKeys(username, "Admin").build();
		seriesofact.perform();

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		org.openqa.selenium.interactions.Action seriesofact1 = builder.moveToElement(password).click()
				.keyDown(password, Keys.INSERT).sendKeys(password, "admin123").build();
		seriesofact1.perform();

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
	}
       @BeforeMethod
       public void setup() {
	  // driver = new ChromeDriver();
    	   driver = new EdgeDriver();

}

}