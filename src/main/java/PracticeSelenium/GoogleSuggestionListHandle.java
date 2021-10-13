package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSuggestionListHandle {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.com/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		By name = By.name("q");
		By SuggestionList = By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span");
//		eleUtil.googleSearchSelect(name, SuggestionList, "microsoft", "microsoft office");
		
		
//		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
//		Thread.sleep(2000);
//		
//		List<WebElement> SuggList = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']/span"));
//		System.out.println(SuggList.size());
//		
//		for(WebElement e : SuggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("naveen automation labs telegram")) {
//				e.click();
//				break;
//			}
//		}
		
		
		
		
		

	}

}
