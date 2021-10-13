package PracticeSelenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	public static void main(String[] args) {

//		total images on the page
//		for each image, print src and alt value

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.amazon.in/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
//		List<WebElement> imageList = driver.findElements(By.tagName("img"));
//		
//		System.out.println("Total Images: " + imageList.size());
		
//		By imageList = By.tagName("img");
//		System.out.println(eleUtil.getElements(imageList).size());
		
//		for(int i = 0; i<eleUtil.getElements(imageList).size(); i++) {
//			String altVal =  eleUtil.getElements(imageList).get(i).getAttribute("alt");
//			String srcVal = eleUtil.getElements(imageList).get(i).getAttribute("src");
//			
//			System.out.println(altVal + " : " + srcVal);
//		}
		
//		for(WebElement e : eleUtil.getElements(imageList) ) {
//			System.out.println("altValue: " + e.getAttribute("alt"));
//		}
		
		
//		TotalImages linka on the page, and print its text and href value
		
		By tagName = By.tagName("a");
		System.out.println("Links List are: " +eleUtil.getElements(tagName).size());
		
		for(WebElement e : eleUtil.getElements(tagName)) {
			System.out.println("href are : " + e.getAttribute("href"));
			System.out.println("text : " + e.getText());
		}
		
		
		
		
		
		
		br.quitBrowser();

	}

}
