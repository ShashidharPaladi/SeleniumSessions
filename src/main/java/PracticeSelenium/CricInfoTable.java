package PracticeSelenium;

import org.openqa.selenium.WebDriver;

public class CricInfoTable {

	public static void main(String[] args) {
	
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.co.in/");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.navigate().to("https://classic.crmpro.com/index.html");
		
		
		
		
		
		

	}

}
