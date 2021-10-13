package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllValues {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		
		By Country = By.id("Form_submitForm_Country");
		eleUtil.doSelectDropDown(Country, "India");
		

		
		
//		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
//		Select select = new Select(country);
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println("Total Options: " + optionsList.size());
//		
//		for(WebElement e : optionsList) {
//			String Text = e.getText();
//			System.out.println(Text);
//			if(Text.trim().equals("India")) {
//				e.click();
//				break;
//			}
//		}
		
		
		
	}

}
