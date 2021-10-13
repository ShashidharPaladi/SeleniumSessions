package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;

	public static void main(String[] args) {

//		1.By.id(null) ID: is a Unique locator (which is in LocatorsConcept.java)
//		2. By.name(null) name: it can be duplicate

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		
//		driver.findElement(By.name("firstname")).sendKeys("shashi");
		
//		3. By.className(null)
//		4. By.xpath(null)
//		5. By.cssSelector(null)
//		6. By.linkText(null)
//		7. By.partialLinkText(null)
//		8. By.tagName(null)
		
		

	}

}
