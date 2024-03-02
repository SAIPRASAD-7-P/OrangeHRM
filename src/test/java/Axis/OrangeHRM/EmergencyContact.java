package Axis.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class emergencycontact extends HRMLogin {
	@AfterMethod
	public void addemergency() {
		  WebElement myInfoTab = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));
	        myInfoTab.click();
	        
			WebElement emergency = driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewEmergencyContacts/empNumber/7']"));
	        emergency.click();
	        
	        WebElement addem = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"));
	        addem.click();
	        
	        WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));
	        name.sendKeys("Saiprasad");
	        WebElement relation = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
	        relation.sendKeys("brother");
	        WebElement mobile = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
	        mobile.sendKeys("7729899895");
	        
	        WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"));
	        save.click();    
	        	
	}

}