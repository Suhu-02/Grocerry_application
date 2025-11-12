package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.TestNGBase;
import constants.Constant;
import pages.LoginPage;
import utilities.ExcelUtility;

public class Logintest extends TestNGBase{
	
	@Test(priority =1, description= "to verify login with valid credentials") 
	
	public void verifyLoginwithValidCredentials() throws IOException {
		
		//reading data from excel file		
		String usernamevalue= ExcelUtility.getStringData(1,0,Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue);
		loginpage.enterpassword(passwordvalue);
		loginpage.signin();
		
		
		
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		//assertion
		String actual = driver.getCurrentUrl();
		String expected= "https://groceryapp.uniqassosiates.com/admin";
		Assert.assertEquals(actual, expected); //softassert. in case softassert is used
		//if assert fails, an error "assertion" failed will be returned
		
		
	}
		
	@Test(priority= 2, description="to verify with validusername and invalid pw")
	
	public void verifyValidUsernameInvalidPassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(2,0,Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(2, 1, Constant.SHEETNAME);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue);
		loginpage.enterpassword(passwordvalue);
		loginpage.signin();
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		 // Assert that the URL stays the same, meaning login failed and we are still on the login page
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://groceryapp.uniqassosiates.com/admin/login"; // Assuming this is the login page URL
	    Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority=3, description= "to verify invalidusername and valid pw")
	
	public void verfiyInvalidusernamevalidPassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(3,0,Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(3, 1, Constant.SHEETNAME);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue);
		loginpage.enterpassword(passwordvalue);
		loginpage.signin();
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://groceryapp.uniqassosiates.com/admin/login"; // Assuming this is the login page URL
	    Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
	@Test (priority=4, description="to verify with invalid credentials")
	//passing string values since data provider contains string data
	
	public void verifyInvalidusernameInvalidpassword() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(4,0, Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(4, 1, Constant.SHEETNAME); 
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue);
		loginpage.enterpassword(passwordvalue);
		loginpage.signin();
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://groceryapp.uniqassosiates.com/admin/login"; // Assuming this is the login page URL
	    Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	//data provider
	@DataProvider(name="loginProvider") //annotation used to set the name 'loginProvider'.
	public Object[][] getDataFromDataProvider() throws IOException ///syntax of data provider
	{
		return new Object[][] { new Object[] {"user","password"}, //format to return object. data in the curly braces are the input data for username and password fields
			new Object[] {"username","pass"},
			new Object[] {"user","password"}
		};
	}
		

	
		
		
	
	
	

}
