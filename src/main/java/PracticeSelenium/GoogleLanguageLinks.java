package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLanguageLinks {

	public static void main(String[] args) {
	
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.co.in/");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/login");
		
//		By LangList = By.xpath("//div[@id='SIvCob']/a");
//		eleUtil.doLinkClick(LangList, "ಕನ್ನಡ");
//		System.out.println(eleUtil.getElements(LangList).size());
//		for(WebElement e : eleUtil.getElements(LangList)) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.trim().equals("ಕನ್ನಡ")) {
//				e.click();
//				break;
//			}
//		}
		
		
		
//		List<WebElement> langList = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		
//		System.out.println(langList.size());
//		
//		for(WebElement e : langList) {
//			String text = e.getText();
//			System.out.println(text);
//			
//			if(text.trim().equals("हिन्दी")) {
//				e.click();
//				break;
//			}
//		}
		
		
		
//		amazon link find
		
		By LangList = By.xpath("//footer//a");
		eleUtil.doLinkClick(LangList, "OpenCart");
		System.out.println(eleUtil.getElements(LangList).size());
		for(WebElement e : eleUtil.getElements(LangList)) {
			String text = e.getText();
			System.out.println(text);
			if(text.trim().equals("Contact Us")) {
				e.click();
				break;
			}
		}
		
//		br.quitBrowser();

	}


}
