package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRMProAssign {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.co.in/");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.navigate().to("https://classic.crmpro.com/index.html");
		
		
		By headingsList = By.xpath("//div[@class='col-sm-10']//h3");
		
		List<WebElement> head =   driver.findElements(headingsList);
		System.out.println(head.size());
		for(WebElement e : head) {
			System.out.println(e.getText());
		}
		
//		System.out.println(eleUtil.getElements(headingsList).size());
//		for(WebElement e : eleUtil.getElements(headingsList)) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
//		By link = By.xpath("//div[@id='navbar-collapse']//a");
//		eleUtil.doLinkClick(link, "Pricing");
//		List<WebElement> linkList = driver.findElements(link);
//		System.out.println(linkList.size());
//		for(WebElement e : linkList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.trim().equals("Customers")){
//				e.click();
//				break;
//			}
//		}
//		
//		br.quitBrowser();
	}

}
