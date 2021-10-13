package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoSuchElementException {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		ElementUtil eleUtil = new ElementUtil(driver);

		By search = By.name("search");
		By forgetPwd = By.linkText("Forgotten Password");
		
		
		//driver.findElement(search).sendKeys("macbook");//NoSuchElementException
		
		List<WebElement> searchList = driver.findElements(search);
		System.out.println(searchList.size());

	}

}
