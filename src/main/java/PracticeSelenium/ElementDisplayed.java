package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ElementDisplayed {
	


	public static void main(String[] args) {
	
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://classic.freecrm.com/register/");
//		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
//		WebElement disp = driver.findElement(By.id("input-email"));
//		System.out.println(disp.isDisplayed());
//		System.out.println(flag);
		
		
//		By disp = By.id("input-email");
//		System.out.println(eleUtil.doIsDisplay(disp));
		
//		Boolean flag = driver.findElement(By.name("search")).isEnabled();
//		System.out.println(flag);
		
//		By search = By.name("search");
//		System.out.println(eleUtil.doIsEnabled(search));
//		
//		By enb = By.name("submitButton");
//		System.out.println(eleUtil.doIsEnabled(enb));
		
//		WebElement submit = driver.findElement(By.name("submitButton"));
//		System.out.println(submit.isDisplayed());
//		System.out.println(submit.isEnabled());
//		
//		WebElement check =  driver.findElement(By.name("agreeTerms"));
//		System.out.println(check.isDisplayed());
//		System.out.println(check.isEnabled());
//		System.out.println(check.isSelected());
//		check.click();
//		System.out.println(check.isSelected());
		
		By checkbox = By.name("agreeTerms");
//		System.out.println( eleUtil.doIsDisplay(checkbox));
		System.out.println(eleUtil.doIsEnabled(checkbox));
		System.out.println(eleUtil.doIsSelected(checkbox));
		eleUtil.doClick(checkbox);
		System.out.println(eleUtil.doIsSelected(checkbox));
		
		
		
		
		
		

	}

}
