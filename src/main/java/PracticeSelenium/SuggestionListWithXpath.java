package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuggestionListWithXpath {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.google.co.in/");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed ']")).click();
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
//		Thread.sleep(3000);
		//driver.findElement(By.xpath(""))
		
		
		
		
		
	}

}
