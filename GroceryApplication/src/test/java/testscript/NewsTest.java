package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase {
	
	@Test(priority=1 ,description= "adding news in manage news")
	
	public void addnews() throws IOException{
		
		//reading data from excel file		
				String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
				String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
				WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
				username.sendKeys(usernamevalue);
				WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
				password.sendKeys(passwordvalue);
				WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
				login.click();
				WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
				managenews.click();
				WebElement newbutton= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
				newbutton.click();
				WebElement newsarea= driver.findElement(By.xpath("//textarea[@id='news']"));
				newsarea.sendKeys("today news");
				WebElement save= driver.findElement(By.xpath("//button[@type='submit']"));
				save.click();	
				
	}	
	
	@Test (priority=2, description= "search news")
	public void searchNews()throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
		WebElement searchbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		searchbtn.click();
		WebElement searcharea= driver.findElement(By.xpath("//input[@class='form-control']"));
		searcharea.sendKeys("today news");
		WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		
				
	}
	
	@Test (priority=3, description="back to home")
	
	public void home() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();		 
	    WebElement homebtn= driver.findElement(By.xpath("//a[text()='Home']"));
		homebtn.click();
	}
	
	@Test(priority=4, description="back to reset")
	
	public void reset() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordvalue);
		WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
		WebElement resetbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		resetbtn.click();
		
		
		
	}
		
		
		
	
	
	
	
	
	
				
}
