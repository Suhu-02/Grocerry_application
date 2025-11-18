package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver; //webdriver instance	
	WaitUtility waitutility = new WaitUtility();
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition, to Initialize page factory
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
			
}
	//implemention PF
@FindBy(xpath="//input[@name='username']") WebElement username;

public void enterusername(String usernamevalue) {
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernamevalue);
	}
	
@FindBy(xpath= "//input[@name='password']") WebElement password;

public void enterpassword(String passwordvalue) {
	//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passwordvalue);
}
@FindBy(xpath= "//button[@type='submit']") WebElement login;

 public void signin() {
	 
	// WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
	 waitutility.waitUntilClickable(driver, login);
		login.click();
 }
 
 

}










