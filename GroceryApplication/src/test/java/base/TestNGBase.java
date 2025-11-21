package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;

import utilities.ScreenshotUtility;

public class TestNGBase {	
	Properties prop;
	FileInputStream f;
		
		public WebDriver driver; //its an interface
		
		@Parameters("browser")
		@BeforeMethod(alwaysRun=true)
		
		public void initializeBrowser(String browser) throws Exception {
			
			prop = new Properties();
			f= new FileInputStream(Constant.CONFIGFILE);
			prop.load(f);
			
			if(browser.equalsIgnoreCase("chrome")) { //cross browser testing
				//driver= new ChromeDriver(); //chrome driver is a class which implements web browser
				ChromeOptions options = new ChromeOptions(); //change settings within chrome
				Map<String,Object> prefs=new HashMap<>();
				prefs.put("profile.password_manager_leak_detection", false);
				options.setExperimentalOption("prefs", prefs);
				driver=new ChromeDriver(options);
				
			}			
			else if(browser.equalsIgnoreCase("firefox")) {
				driver= new FirefoxDriver();
							
			}
			else {
				System.out.println("invalid browser");
			}
			driver.get(prop.getProperty("url")); //open url
			driver.manage().window().maximize();
			//driver.manage().window().minimize();
					
		}
		
		@AfterMethod
		
		public void closeBrowser() {
			//driver.close(); //tab
			//System.out.println("closed");
			//driver.quit(); //window
		}
		
		@AfterMethod(alwaysRun = true) //this method must run in every scenario
		public void driverQuit(ITestResult iTestResult) throws IOException
		{
			//iTestResult a predefined interface having all info regarding our test case / test data
			if(iTestResult.getStatus()==ITestResult.FAILURE) 
			{
				ScreenshotUtility screenShot=new ScreenshotUtility();
				screenShot.getScreenshot(driver, iTestResult.getName()); //getname: returns name of test method
			}
			driver.quit();

		}
		
	
}


