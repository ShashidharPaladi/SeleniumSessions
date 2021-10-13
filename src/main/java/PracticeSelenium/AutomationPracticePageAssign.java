package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationPracticePageAssign {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("http://automationpractice.com/index.php");
		ElementUtil eleUtil = new ElementUtil(driver);
		
//		driver.navigate().to("http://automationpractice.com/index.php");
//		
//		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
//		
//		Thread.sleep(10000);
//		
//		driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed ']")).click();
		
		By name = By.id("search_query_top");
		By links = By.xpath("//div[@class='ac_results']//li");
//		eleUtil.googleSearchSelect(name, links, "Dress", "Casual Dresses > Printed Dress");
		
		By text = By.xpath("//h1[@itemprop='name']");
		
		System.out.println(eleUtil.doGetText(text));
		
		
		
		
		
		
		
		
		

	}

}
