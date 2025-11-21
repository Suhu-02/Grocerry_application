package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
//public void adminButton() 
	public HomePage adminButton(){
	//WebElement adminDropdown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	waitutility.waitUntilClickable(driver, adminDropdown);
    //adminDropdown.click();
	pageutility.clickOnElement(adminDropdown);
	return this;
	
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutButton;
//public void logOut() 
public LoginPage logOut(){
	//WebElement logoutButton = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']"));
    //another xpath- //i[@class='ace-icon fa fa-power-off']
   // logoutButton.click();
	pageutility.clickOnElement(logoutButton);
	return new LoginPage(driver);
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminuserbtn;
//public void admininfo() 
public AdminPage admininfo(){
	//WebElement adminuserbtn= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
	//adminuserbtn.click();
	pageutility.clickOnElement(adminuserbtn);
	return new AdminPage(driver);
	
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;

//public void manage() 
public NewsPage manage(){
	//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
	//managenews.click();
	pageutility.clickOnElement(managenews);
	return new NewsPage(driver);
}
	
}
