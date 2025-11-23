package testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constants.Constant;
import constants.Messages;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase {
	public AdminPage adminpage;
    public HomePage home;
	
    
@Test(priority =1, description= "logout function") 
	
	public void verifyLoginwithValidCredentials() throws IOException {
		
		//reading data from excel file		
		String usernamevalue= ExcelUtility.getStringData(1,0, Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue).enterpassword(passwordvalue);
		HomePage home = new HomePage(driver);
		home= loginpage.signin();
		adminpage = home.adminButton();
		
		loginpage= home.logOut();
                
		//loginpage.enterusername(usernamevalue);
		//loginpage.enterpassword(passwordvalue);
		//loginpage.signin();
		
		//HomePage homepage= new HomePage(driver);
		//homepage.adminButton();
		//homepage.logOut();
		
		String current = driver.getCurrentUrl();
	    String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	    Assert.assertEquals(current, expected, Messages.HOMEALERT_ASSERT);
	        
	   
	     
		
	}

 }


