package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.WaitUtility;

public class AdminPage {
	
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminuserbtn;
	public void admininfo() {
		//WebElement adminuserbtn= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminuserbtn.click();
		
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement clicknewbutton;
		
	public void clickinfo() {
		//WebElement clicknewbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		 waitutility.waitUntilClickable(driver, clicknewbutton);
		clicknewbutton.click();
		
	}
	@FindBy(xpath="//input[@type= 'text' and @id='username']") WebElement newusername;
	public void username(String randomusername) {
		//WebElement newusername= driver.findElement(By.xpath("//input[@type= 'text' and @id='username']"));
		newusername.sendKeys(randomusername);		
		
	}
	
	@FindBy(xpath="//input[@type= 'password' and @id='password']") WebElement newpassword;
	public void password(String randompassword) {
		//WebElement newpassword= driver.findElement(By.xpath("//input[@type= 'password' and @id='password']"));
		newpassword.sendKeys(randompassword);		
		
	}
	
	@FindBy(xpath="//select[@class= 'form-control' and @name='user_type']") WebElement usertype;
	public void dropdown() {
		//WebElement usertype= driver.findElement(By.xpath("//select[@class= 'form-control' and @name='user_type']"));
		Select select= new Select(usertype);
		select.selectByVisibleText(Constant.ADMINTYPE);	
		
	}
	@FindBy(xpath="//button[@type= 'submit' and @name='Create']") WebElement savebtn;
	public void save() {
		//WebElement savebtn= driver.findElement(By.xpath("//button[@type= 'submit' and @name='Create']"));
		savebtn.click();	
		
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement successAlert;
	public boolean isAlertDisplayed() {
		//WebElement successAlert = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		return successAlert.isDisplayed();	
		
	}
	
	
	
}
