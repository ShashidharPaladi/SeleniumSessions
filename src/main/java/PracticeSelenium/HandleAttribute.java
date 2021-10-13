package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleAttribute {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://classic.freecrm.com/register/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
//		String attVal = driver.findElement(By.name("first_name")).getAttribute("type");
//		System.out.println(attVal);
		
//		String AttVal =  driver.findElement(By.id("submitButton")).getAttribute("disabled");
//		System.out.println(AttVal);
//		if(AttVal.equals("true")) {
//			System.out.println("element is disabled");
//		}
		
//		By Submit = By.id("submitButton");
//		System.out.println(eleUtil.checkElementDisabled(Submit, "disabled"));
		
		By submit = By.id("submitButton");
		System.out.println(eleUtil.doGetAttributeValue(submit, "disabled"));
		System.out.println(eleUtil.checkElementDisabled(submit, "disabled"));
		
		
		
	}

}
