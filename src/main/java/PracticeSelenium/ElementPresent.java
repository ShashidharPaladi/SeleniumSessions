package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementPresent {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		
		By search = By.name("search");
		
		By forgetPwd = By.linkText("Forgotten Password");
//		List<WebElement> searchList =  driver.findElements(search);
//		
//		if(searchList.size() == 1) {
//			System.out.println("search field is present");
//		}
//		else {
//			System.out.println("not present");
//		}
//		System.out.println(eleUtil.checkElementDisplayed(search));
		System.out.println(eleUtil.checkElementDisplayed(search));
		System.out.println(eleUtil.checkElementDisplayed(forgetPwd, 1));
		
		
		
		
		br.quitBrowser();
		
		
		
		
	}

}
