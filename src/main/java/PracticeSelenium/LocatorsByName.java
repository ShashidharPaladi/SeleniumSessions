package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsByName {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		1.
//		driver.findElement(By.name("firstname")).sendKeys("shashi");
		
//		2.
//		WebElement fn = driver.findElement(By.name("firstname"));
//		WebElement ln = driver.findElement(By.name("lastname"));
//		WebElement emailId = driver.findElement(By.name("email"));
//		WebElement telePhone = driver.findElement(By.name("telephone"));
//		WebElement pwd = driver.findElement(By.name("password"));
//		WebElement confirmPwd = driver.findElement(By.name("confirm"));
//		WebElement checkbox = driver.findElement(By.name("agree"));
//		
//		
//		fn.sendKeys("shashi");
//		ln.sendKeys("paladi");
//		emailId.sendKeys("shasih@gmail.com");
//		telePhone.sendKeys("214989024");
//		pwd.sendKeys("123asf");
//		confirmPwd.sendKeys("123asf");
//		checkbox.click();
		
//		3.
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		By emailId = By.name("email");
//		By tele = By.name("telephone");
//		By pwd = By.name("password");
//		By conPwd = By.name("confirm");
//		By checkbox = By.name("agree");
//		
//		
//		driver.findElement(fn).sendKeys("shashi");
//		driver.findElement(ln).sendKeys("paladi");
//		driver.findElement(emailId).sendKeys("shasih@gmail.com");
//		driver.findElement(tele).sendKeys("123354465");
//		driver.findElement(pwd).sendKeys("123asf");
//		driver.findElement(conPwd).sendKeys("123asf");
//		driver.findElement(checkbox).click();
		
//		4.
//		By firstName = By.name("firstname");
//		By lastName = By.name("lastname");
//		By Email = By.name("email");
//		By Tele = By.name("telephone");
//		By Pwd = By.name("password");
//		By Cpwd = By.name("confirm");
//		By Checkbox = By.name("agree");
//		
//		
//		WebElement fn = driver.findElement(firstName);
//		WebElement ln = driver.findElement(lastName);
//		WebElement email = driver.findElement(Email);
//		WebElement tele = driver.findElement(Tele);
//		WebElement pass = driver.findElement(Pwd);
//		WebElement Cpass = driver.findElement(Cpwd);
//		WebElement Cbox = driver.findElement(Checkbox);
//		
//		fn.sendKeys("shashi");
//		ln.sendKeys("paladi");
//		email.sendKeys("shasih@gmail.com");
//		tele.sendKeys("12345566");
//		pass.sendKeys("123asf");
//		Cpass.sendKeys("123asf");
//		Cbox.click();
		
//		5.
//		By Fname = By.name("firstname");
//		By Lname = By.name("lastname");
//		By Cbox = By.name("agree");
//		
		ElementUtil eleUtil = new ElementUtil(driver);
//		
//		eleUtil.getElement(Fname).sendKeys("shashdi");
//		eleUtil.getElement(Lname).sendKeys("palsdo");
//		eleUtil.getElement(Cbox).click();
//		6.
		
//		By Fname = By.name("firstname");
//		By Lname= By.name("lastname");
//		By Email = By.name("email");
//		By TeleP = By.name("telephone");
//		By Pwd = By.name("password");
//		By Cpwd = By.name("confirm");
//		By Cbox = By.name("agree");
//		
//		
//		eleUtil.doSendKeys(Fname, "shashi");
//		eleUtil.doSendKeys(Lname, "plasdo");
//		eleUtil.doSendKeys(Email, "shashi@gmail.com");
//		eleUtil.doSendKeys(TeleP, "12345666");
//		eleUtil.doSendKeys(Pwd, "123asf");
//		eleUtil.doSendKeys(Cpwd, "123asf");
//		eleUtil.getElement(Cbox).click();
//		eleUtil.doClick(Cbox);
		
		
		
		
//		driver.quit();
		
	}
	
	

}
