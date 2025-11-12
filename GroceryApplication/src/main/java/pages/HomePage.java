package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		
	}
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminDropdown;
public void adminButton() {
	WebElement adminDropdown = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
    adminDropdown.click();
}

@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logoutButton;
public void logOut() {
	WebElement logoutButton = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']"));
    //another xpath- //i[@class='ace-icon fa fa-power-off']
    logoutButton.click();
}


	
}
