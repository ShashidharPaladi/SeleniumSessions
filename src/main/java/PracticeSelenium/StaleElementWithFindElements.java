package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithFindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

		List<WebElement> footerList = driver.findElements(By.xpath("//footer//a"));

		System.out.println(footerList.size());

		for (WebElement e : footerList) {
			footerList =driver.findElements(By.xpath("//footer//a"));
			System.out.println(e.getText());
			e.click();
//			Thread.sleep(5000);
//			driver.navigate().refresh();
			driver.get("https://demo.opencart.com/index.php?route=account/login");
			
		}

	}

}
