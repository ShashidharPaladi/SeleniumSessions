package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignGetLinksAndText {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By LinkList = By.tagName("a");
		int size = eleUtil.getElements(LinkList).size();
		System.out.println("LinkList size is : " + size);
		
//		for(int i = 0; i<eleUtil.getElements(LinkList).size(); i++) {
//			String href = eleUtil.getElements(LinkList).get(i).getAttribute("href");
//			String text = eleUtil.getElements(LinkList).get(i).getText();
//			System.out.println("href is : " + href + " Text is : " + text);
//		}
		
		for(WebElement e : eleUtil.getElements(LinkList)) {
			String href = e.getAttribute("href");
			String text = e.getText();
			System.out.println("href is : " + href + " Text is : " + text);
		}
		
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
		System.out.println("---------------");
		
		By TextField = By.tagName("input");
		int textSize = eleUtil.getElements(TextField).size();
		System.out.println("TextField size is : " + textSize); 
		
		
//		for(int i = 0; i < eleUtil.getElements(TextField).size(); i++) {
//			String placeHolder = eleUtil.getElements(TextField).get(i).getAttribute("placeholder");
//			if(placeHolder.isEmpty()) {
//				
//			}
//			else {
//			System.out.println("PlaceHolder is : " + placeHolder);
//			}
//		}
		
		for(WebElement e : eleUtil.getElements(TextField)) {
			String PlcHolder = e.getAttribute("placeholder");
			if(PlcHolder.isEmpty()) {
				
			}
			else {
				System.out.println("placeHolder is : " + PlcHolder);
			}
		}
		
		br.quitBrowser();
		
	}

}
