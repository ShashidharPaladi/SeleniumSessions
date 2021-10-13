package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.in");
		String title = driver.getTitle();
		System.out.println("page title is " + title);
		if (title.equalsIgnoreCase("google")) {
			System.out.println("title is correct");
		}
		else {
		System.out.println("title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("Copyright"));
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
