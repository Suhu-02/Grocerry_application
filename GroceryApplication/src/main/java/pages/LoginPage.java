package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver; //webdriver instance	
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition, to Initialize page factory
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
}
	//implemention PF
@FindBy(xpath="//input[@name='username']") WebElement username;

//public void enterusername(String usernamevalue)
//change void to LoginPage
public LoginPage enterusername(String usernamevalue){
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernamevalue);
	pageutility.sendDataToElement(username, usernamevalue);
	return this;
	
	}
	
@FindBy(xpath= "//input[@name='password']") WebElement password;

//public void enterpassword(String passwordvalue) 
public LoginPage enterpassword(String passwordvalue){
	//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	//password.sendKeys(passwordvalue);
	pageutility.sendDataToElement(password, passwordvalue);
	return this;
	
	
	
}
@FindBy(xpath= "//button[@type='submit']") WebElement login;

 //public void signin()
public HomePage signin(){
	 
	// WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
	 //explicit wait
	 waitutility.waitUntilClickable(driver, login);
		//login.click();
	 pageutility.clickOnElement(login);
	 return new HomePage(driver);//since homepage is a parametereised constructor, object initialisation
}
//Page Factory: Design pattern to avoid repetition
//all others within loginpage, signin navigatesto homepage
//chaining of classes
}
	 
	











