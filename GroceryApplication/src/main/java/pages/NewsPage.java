package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class NewsPage {
	
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	
	public NewsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
	
	public void manage() {
		//WebElement managenews= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	public void newbuttonmethod() {
		//WebElement newbutton= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		waitutility.waitUntilClickable(driver, newbutton);
		newbutton.click();
	}
	
	@FindBy(xpath="//textarea[@id='news']") WebElement newsarea;
	
	public void newsareamethod() {
		//WebElement newsarea= driver.findElement(By.xpath("//textarea[@id='news']"));
		newsarea.sendKeys("today news");
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	public void savemethod() {
		//WebElement save= driver.findElement(By.xpath("//button[@type='submit']"));
		save.click();	
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchbtn;
	public void searchbtnmethod() {
		//WebElement searchbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		searchbtn.click();	
	}
	
	@FindBy(xpath="//input[@class='form-control']") WebElement searcharea;
	public void searchareamethod() {
		//WebElement searcharea= driver.findElement(By.xpath("//input[@class='form-control']"));
		searcharea.sendKeys("today news");	
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement search;
	public void searchmethod() {
		//WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();	
	}
	
	@FindBy(xpath="//a[text()='Home']") WebElement homebtn;
	public void homebtnmethod() {
		//WebElement homebtn= driver.findElement(By.xpath("//a[text()='Home']"));
		homebtn.click();
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetbtn;
	public void resetbtnmethod() {
		//WebElement resetbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		resetbtn.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public boolean isAlertDisplayed() {
		//WebElement alert= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		return alert.isDisplayed();
	}
	
	
	
}
