package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait
		
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
public void adminButton() {
	//WebElement adminDropdown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
	waitutility.waitUntilClickable(driver, adminDropdown);
    adminDropdown.click();
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutButton;
public void logOut() {
	//WebElement logoutButton = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']"));
    //another xpath- //i[@class='ace-icon fa fa-power-off']
    logoutButton.click();
}


	
}
