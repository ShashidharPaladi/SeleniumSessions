package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectHtmlTagDropDown {

	public static void main(String[] args) {
		
//		html tag : <select>
//		use select class in selenium
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		By country = By.id("Form_submitForm_Country");
		eleUtil.doSelectByIndex(country, 4);
//		eleUtil.doSelectByValue(country, "India");
//		eleUtil.doSelectByVisibleText(country, "America");
		
//		By DownList = By.xpath("//select/option");
//		List<WebElement> countryList = driver.findElements(DownList);
//		System.out.println(countryList.size());
//		for(WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		
//		By selc = By.id("Form_submitForm_Country");
//		
//		WebElement country = driver.findElement(selc);
//		
//		Select s = new Select(country);
////		s.selectByIndex(4);
//		s.selectByValue("India");
		
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
//		
//		Select select = new Select(country);
//		select.selectByIndex(5);
		
//		String text = select.getFirstSelectedOption().getText();
//		System.out.println(text);
		
//		select.selectByValue("India");
//		String text = select.getFirstSelectedOption().getText();
//		System.out.println(text);
//		select.selectByVisibleText("India");
		
		
		
		
		
		
		
		
		
		
//		br.quitBrowser();

	}

}
