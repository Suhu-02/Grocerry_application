package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.TestNGBase;
import utilities.ExcelUtility;

public class Logintest extends TestNGBase{
	
	@Test(priority =1, description= "to verify login with valid credentials") 
	
	public void verifyLoginwithValidCredentials() throws IOException {
		
		//reading data from excel file		
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	}
		
	@Test(priority= 2, description="to verify with validusername and invalid pw")
	
	public void verifyValidUsernameInvalidPassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(2,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(2, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}
	
	@Test(priority=3, description= "to verify invalidusername and valid pw")
	
	public void verfiyInvalidusernamevalidPassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(3,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(3, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		
	}
	
	@Test (priority=4, description="to verify with invalid credentials")
	
	public void verifyInvalidusernameInvalidpassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(4,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(4, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
	}
		
		
		
		
		
		
		
		
		
	
	
	

}
