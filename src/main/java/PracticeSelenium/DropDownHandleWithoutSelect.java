package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownHandleWithoutSelect {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
//		eleUtil.doSelectDropDownWithoutSelect(country, "India");

//		By DownList = By.xpath("//select[@id='Form_submitForm_Country']/option");
//		List<WebElement> countryList = driver.findElements(DownList);
//		System.out.println(countryList.size());
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		

	}

}
