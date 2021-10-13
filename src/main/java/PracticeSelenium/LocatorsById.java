package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsById {

	static WebDriver  driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		create webelement + perform action(click, sendkeys, get text, isdisplayed)
		
//		1.
//		driver.findElement(By.id("input-email")).sendKeys("Shashi@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("shashi123");
		
//		2.
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("shashi@gmail.com");
//		password.sendKeys("shashi123");
		
//		3. By locator
//		a.ID
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("shashi@gmail.com");
//		driver.findElement(password).sendKeys("shashi123");
		
//		4.
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement eId = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//		
//		eId.sendKeys("shashi@gmail.com");
//		pwd.sendKeys("shashi123");
		
//		5. generic function: getElement()
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("shashi@gmail.com");
//		getElement(password).sendKeys("shashi123");
		
//		6. generic function : getElement() , sendKeys()
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "shasi@gmail.com");
//		doSendKeys(password, "shasi123");
		
		
//		7.
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "shashi@gmail,com");
		eleUtil.doSendKeys(password, "shasi123");
		driver.quit();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
}
