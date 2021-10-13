package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/shashidharpaladi/downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("page title is " + title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		title = driver.getTitle();
		System.out.println("page titel is : " + title);
		
		
		
		

	}

}
