package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
		//assertion
		String actual = driver.getCurrentUrl();
		String expected= "https://groceryapp.uniqassosiates.com/admin";
		Assert.assertEquals(actual, expected); //softassert. in case softassert is used
		//if assert fails, an error "assertion" failed will be returned
		
		
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
		
		 // Assert that the URL stays the same, meaning login failed and we are still on the login page
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://groceryapp.uniqassosiates.com/admin/login"; // Assuming this is the login page URL
	    Assert.assertEquals(actualUrl, expectedUrl, "Login should fail with invalid password and stay on the login page.");
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
		
		
	    String actualUrl1 = driver.getCurrentUrl();  // Actual URL after login attempt
	    // The expected URL of the login page (since the login should fail)
	    String expectedUrl1 = "https://groceryapp.uniqassosiates.com/admin/login";  // Expected URL	    
	    Assert.assertEquals(actualUrl1, expectedUrl1, "Login fail");
		
		
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
		
	    String actualUrl = driver.getCurrentUrl();
	    // The expected URL of the login page (since the login should fail)
	    String expectedUrl = "https://groceryapp.uniqassosiates.com/admin/login"; 

	    // Assert that the URL remains the same (i.e., the user stays on the login page)
	    Assert.assertEquals(actualUrl, expectedUrl, "Login should fail ");
		
	}
		
		
		
		
		
		
		
		
		
	
	
	

}
