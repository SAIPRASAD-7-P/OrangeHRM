package Axis.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@SuppressWarnings("unused")

public class Addimmigration extends HRMLogin {
@Test
	@AfterMethod
	public void AddImmigration(){
	

        WebDriver driver = HRMLogin.driver;
		WebElement myinfo =  driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]"));
		myinfo.click();
		
		WebElement immigration = driver.findElement(By.xpath("//a[contains(text(),'Immigration')]"));
		immigration.click();
		
		WebElement addinfo = driver.findElement(By.xpath(" (//button[@type='button'][normalize-space()='Add'])[1]"));
		addinfo.click();
		
		WebElement radio1 = driver.findElement(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[1]"));
		radio1.click();

		WebElement passnumber = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[2]"));
		passnumber.click();
		passnumber.sendKeys("VA1356");
		
		WebElement issuedate = driver.findElement(By.xpath(" (//input[@placeholder='yyyy-dd-mm'])[1]"));
		issuedate.click();
		issuedate.sendKeys("2015-18-07");
		
		WebElement expirydate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]"));
		expirydate.click();
		expirydate.sendKeys("2026-28-02");

		WebElement eligiblestatus = driver.findElement(By.xpath(" (//input[@class='oxd-input oxd-input--active'])[4]"));
		eligiblestatus.click();
		eligiblestatus.sendKeys("Elgible");


		WebElement reviewdate = driver.findElement(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[3]"));
		reviewdate.click();
		reviewdate.sendKeys("2024-21-04");
		
		WebElement comments = driver.findElement(By.xpath("(//textarea[@placeholder='Type Comments here'])[1]"));
		comments.click();
		comments.sendKeys("All Selected Details are Valid");
		
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();
		
	}
	
}