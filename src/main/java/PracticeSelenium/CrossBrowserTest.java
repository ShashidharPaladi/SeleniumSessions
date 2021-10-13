package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTest {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		
		
		String browser = "chrome";
		
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please enter the right browser : "+ browser);
		}
		
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
