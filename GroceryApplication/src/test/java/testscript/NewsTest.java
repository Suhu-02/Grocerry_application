package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constants.Constant;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.NewsPage;
import utilities.ExcelUtility;

public class NewsTest extends TestNGBase {
	public LoginPage loginPage;
    public NewsPage newspage;
    public HomePage home;
	
	@Test(priority=1 ,description= "adding news in manage news", groups= {"smoke"})
	
	public void addnews() throws IOException{
		
		//reading data from excel file		
				String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
				String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
				
				LoginPage loginpage = new LoginPage(driver);
				loginpage.enterusername(usernamevalue).enterpassword(passwordvalue);
				home= loginpage.signin();                
                        
                                   
                       
                        
				//loginpage.enterusername(usernamevalue);
				//loginpage.enterpassword(passwordvalue);
				//loginpage.signin();
				//NewsPage newspage= new NewsPage(driver);
				newspage=home.manage();
				newspage.newbuttonmethod().newsareamethod().savemethod();        
		          	           
		        
				//newspage.manage();
				//newspage.newbuttonmethod();
				//newspage.newsareamethod();
				//newspage.savemethod();
								
				
				//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
				//username.sendKeys(usernamevalue);
				//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
				//password.sendKeys(passwordvalue);
				//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
				//login.click();
				//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
				//managenews.click();
				//WebElement newbutton= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
				//newbutton.click();
				//WebElement newsarea= driver.findElement(By.xpath("//textarea[@id='news']"));
				//newsarea.sendKeys("today news");
				//WebElement save= driver.findElement(By.xpath("//button[@type='submit']"));
				//save.click();	
				
				// Assertion: Verify the news "today news" is displayed on the page.
				boolean isalertDisplayed = newspage.isAlertDisplayed();
				Assert.assertTrue(isalertDisplayed);
	}	
	
	@Test (priority=2, description= "search news")
	public void searchNews()throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue).enterpassword(passwordvalue);
		home= loginpage.signin();
		//loginpage.enterusername(usernamevalue);
		//loginpage.enterpassword(passwordvalue);
		//loginpage.signin();
		//NewsPage newspage= new NewsPage(driver);
		newspage=home.manage();
		newspage.searchbtnmethod().searchareamethod().searchmethod();
		//newspage.manage();
		//newspage.searchbtnmethod();
		//newspage.searchareamethod();
		//newspage.searchmethod();
				
		
		
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();
		//WebElement searchbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		//searchbtn.click();
		//WebElement searcharea= driver.findElement(By.xpath("//input[@class='form-control']"));
		//searcharea.sendKeys("today news");
		//WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		//search.click();
		
		//assertion		
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/news/index";
		Assert.assertEquals(actual, expected);
				
	}
	
	@Test (priority=3, description="back to home")
	
	public void home() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,"Login sheet");
		String passwordvalue= ExcelUtility.getStringData(1, 1, "Login sheet");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue).enterpassword(passwordvalue);
		home= loginpage.signin();
		//loginpage.enterusername(usernamevalue);
		//loginpage.enterpassword(passwordvalue);
		//loginpage.signin();
		//NewsPage newspage= new NewsPage(driver);
		newspage=home.manage();
		newspage.homebtnmethod();
		//newspage.manage();
		//newspage.homebtnmethod();
		
		
		
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();		 
	    //WebElement homebtn= driver.findElement(By.xpath("//a[text()='Home']"));
		//homebtn.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actual, expected);
	}
	
	@Test(priority=4, description="back to reset")
	
	public void reset() throws IOException {
		String usernamevalue= ExcelUtility.getStringData(1,0,Constant.SHEETNAME);
		String passwordvalue= ExcelUtility.getStringData(1, 1, Constant.SHEETNAME);
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterusername(usernamevalue).enterpassword(passwordvalue);
		home= loginpage.signin();
		//loginpage.enterusername(usernamevalue);
		//loginpage.enterpassword(passwordvalue);
		//loginpage.signin();
		//NewsPage newspage= new NewsPage(driver);
		newspage=home.manage();
		newspage.resetbtnmethod();
		//newspage.manage();
		//newspage.resetbtnmethod();
		
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeyss(passwordvalue);
		//WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();
		//WebElement resetbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		//resetbtn.click();
		
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actual, expected, Messages.NEWSALERT_ASSERT);

		
		
		
	}
		
		
		
	
	
	
	
	
	
				
}
