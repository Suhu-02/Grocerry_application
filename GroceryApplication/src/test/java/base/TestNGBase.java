package base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {	
	
		
		public WebDriver driver; //its an interface
		
		@BeforeMethod 
		
		public void initializeBrowser() {
			//driver= new ChromeDriver(); //chrome driver is a class which implements web browser
			ChromeOptions options = new ChromeOptions(); //change settings within chrome
			Map<String,Object> prefs=new HashMap<>();
			prefs.put("profile.password_manager_leak_detection", false);
			options.setExperimentalOption("prefs", prefs);
			driver=new ChromeDriver(options);
			
			driver.get("https://groceryapp.uniqassosiates.com/admin/login"); //open url
			driver.manage().window().maximize();
			//driver.manage().window().minimize();
					
		}
		
		@AfterMethod
		
		public void closeBrowser() {
			//driver.close();
			//System.out.println("closed");
			//driver.quit();
		}
		
	
}


