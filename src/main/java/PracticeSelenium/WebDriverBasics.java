package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/shashidharpaladi/downloads/chromedriver");
		
		System.setProperty("webdriver.gecko.driver", "/Users/shashidharpaladi/downloads/geckodriver");

		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is " + title);
		System.out.println(driver.getCurrentUrl());
		String pagesource = driver.getPageSource();
		System.out.println("pagesource is " + pagesource);
		//driver.quit();
		
		
		
		
		
		
		

	}

}
