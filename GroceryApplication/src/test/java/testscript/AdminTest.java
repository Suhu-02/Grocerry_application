package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestNGBase;

import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends  TestNGBase {
	
	@Test (priority=1, description="to create an admin")
	
	public void createAdmin() throws   IOException {
		
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement adminuserbtn= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminuserbtn.click();
		WebElement clicknewbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		clicknewbutton.click();	
		FakerUtility faker = new FakerUtility();
		String randomusername= faker.createRandomUserName();
		String randompassword= faker.createRandomPassword();
		WebElement newusername= driver.findElement(By.xpath("//input[@type= 'text' and @id='username']"));
		newusername.sendKeys(randomusername);
		WebElement newpassword= driver.findElement(By.xpath("//input[@type= 'password' and @id='password']"));
		newpassword.sendKeys(randompassword);
		WebElement usertype= driver.findElement(By.xpath("//select[@class= 'form-control' and @name='user_type']"));
		Select select= new Select(usertype);
		select.selectByVisibleText("Staff");
		WebElement savebtn= driver.findElement(By.xpath("//button[@type= 'submit' and @name='Create']"));
		savebtn.click();
		
		// Assertion: Verify that admin is created successfully
		WebElement successAlert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		Assert.assertTrue(successAlert.isDisplayed());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
