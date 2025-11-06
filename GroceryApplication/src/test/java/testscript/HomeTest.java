package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
	
@Test(priority =1, description= "logout function") 
	
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
		
		// Click the Admin dropdown (top-right corner)	 
		 WebElement adminDropdown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	     adminDropdown.click();
	     
	  // Click the Logout option
	     WebElement logoutButton = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']"));
	     //another xpath- //i[@class='ace-icon fa fa-power-off']
	     logoutButton.click();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
	}

 }


