package Axis.OrangeHRM;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class AddAttachmentImmigration extends HRMLogin {
@Test
	@AfterMethod
	public void Attachment() {
	
	 //System.setProperty("Webdriver.chrome.driver",
	 //"C:\\Users\\HP\\Documents\\Manipal\\chromedriver-win64\\chromedriver.exe");
			
	 //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 driver.manage().window().maximize();
	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	 WebElement myInfo = driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
	 myInfo.click();
	 System.out.println("Clicked on myinfo");
		
	 WebElement imme = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
	 imme.click();
	 System.out.println("Clicked on Immgration");
		
	 WebElement addbutton = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[2]"));
	 addbutton.click();
		
	 WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));

		//upload.sendKeys("C:\\Users\\gvija\\OneDrive\\Pictures\\screenshot.png");
	 upload.sendKeys("C:\\Users\\HP\\Documents\\Manipal\\Screenshot_20230922_183934.png");

	 WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Type comment here']"));
	 comments.click();
	 comments.sendKeys("screenshot is good ");
		
	 WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
	 save.click();
		
	}


}

