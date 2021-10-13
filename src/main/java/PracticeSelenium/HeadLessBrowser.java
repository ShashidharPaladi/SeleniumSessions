package PracticeSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		
		//headless --> (CH/FF/EDGE)browser options --> it will not launch the browser, but it will block the visibility(display)
				//GhostDriver + PhantomJS --> headless ---> html page source of the application
				//HtmlUnitDriver --> headless --> html page source of the application
				
				//testing is happening behind the scene
				//faster than the UI mode
				//headless is not recommended for complex applications//pop ups/mouse movement
				//recommended for sanity test cases(15-20 tcs)
				
				//headless -- non ui mode
		
//		WebDriverManager.chromedriver().setup();
//		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(co);
//		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		fo.addArguments("--incognito");
		WebDriver driver = new FirefoxDriver(fo);
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
