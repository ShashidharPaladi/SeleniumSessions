package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		
		if (title.equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("page title is correct");
		
		} else {
			System.out.println("page title is not correct");
			
		}
		
		System.out.println(driver.getCurrentUrl().contains("face"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
