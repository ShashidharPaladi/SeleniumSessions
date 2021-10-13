package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	

	public WebDriver driver;
	
	/**
	 * This method is used to init on the basis of given browser name
	 * @param browserName
	 * @return it returns the driver
	 */
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser Name is : " + browserName);
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			
		}
		else {
			System.out.println("Please enter the correct Browser Name: " +browserName);
		}		
		
		return driver;
		
	}
	
	public void launchUrl(String url) {
		if (url == null || url.isEmpty()) {
			System.out.println("url is not correct");
			return;
		}
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	
	}


}
