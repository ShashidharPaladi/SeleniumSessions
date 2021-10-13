package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		RegistrationUtil regUtil = new RegistrationUtil();
		
		WebDriver driver = regUtil.initDriver("Chrome");
		regUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		System.out.println(regUtil.getPageTitle());
		
		By FirstName = By.id("input-firstname");
		By LastName = By.id("input-lastname");
		By Email = By.id("input-email");
		By Telephone = By.id("input-telephone");
		By Password = By.id("input-password");
		By PasswordConfirm = By.id("input-confirm");
		
		ElementUtil eleutil = new ElementUtil(driver);
		
		eleutil.doSendKeys(FirstName, "Shashi");
		eleutil.doSendKeys(LastName, "paladi");
		eleutil.doSendKeys(Email, "shashi@gmail.com");
		eleutil.doSendKeys(Telephone, "801289289");
		eleutil.doSendKeys(Password, "shashi123");
		eleutil.doSendKeys(PasswordConfirm, "shashi123");
		
		regUtil.quitBrowser();

	}

}
