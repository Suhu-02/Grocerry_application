package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class NewsPage {
	
	public WebDriver driver;
	WaitUtility waitutility = new WaitUtility();
	PageUtility pageutility = new PageUtility();
	
	public NewsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this); //pagefactory : design to avoid repetition
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
		}
	
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	//public void newbuttonmethod()
	public NewsPage newbuttonmethod(){
		//WebElement newbutton= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		waitutility.waitUntilClickable(driver, newbutton);
		//newbutton.click();
		pageutility.clickOnElement(newbutton);
		return this;
		
	}
	
	@FindBy(xpath="//textarea[@id='news']") WebElement newsarea;
	
	//public void newsareamethod() 
	public NewsPage newsareamethod(){
		//WebElement newsarea= driver.findElement(By.xpath("//textarea[@id='news']"));
		//newsarea.sendKeys("today news");
		pageutility.sendDataToElement(newsarea, "today news");
		return this;
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement save;
	//public void savemethod() 
	public NewsPage savemethod(){
		//WebElement save= driver.findElement(By.xpath("//button[@type='submit']"));
		//save.click();
		pageutility.clickOnElement(save);
		return this;
		
		
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchbtn;
	//public void searchbtnmethod()
	public NewsPage searchbtnmethod(){
		//WebElement searchbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		//searchbtn.click();	
		pageutility.clickOnElement(searchbtn);
		return this;
		
	}
	
	@FindBy(xpath="//input[@class='form-control']") WebElement searcharea;
	//public void searchareamethod() 
	public NewsPage searchareamethod() {
		//WebElement searcharea= driver.findElement(By.xpath("//input[@class='form-control']"));
		//searcharea.sendKeys("today news");	
		pageutility.clickOnElement(searcharea);
		return this;
		
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement search;
	//public void searchmethod() 
	public NewsPage searchmethod(){
		//WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		//search.click();	
		pageutility.clickOnElement(search);
		return this;
		
	}
	
	@FindBy(xpath="//a[text()='Home']") WebElement homebtn;
	//public void homebtnmethod() 
	public NewsPage homebtnmethod(){
		//WebElement homebtn= driver.findElement(By.xpath("//a[text()='Home']"));
		//homebtn.click();
		pageutility.clickOnElement(homebtn);
		return this;
	}
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']") WebElement resetbtn;
	//public void resetbtnmethod()
	public NewsPage resetbtnmethod(){
		//WebElement resetbtn= driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-warning']"));
		//resetbtn.click();
		pageutility.clickOnElement(resetbtn);
		return this;
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public boolean isAlertDisplayed() {
		//WebElement alert= driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		return alert.isDisplayed();
	}
	
	
	
}
