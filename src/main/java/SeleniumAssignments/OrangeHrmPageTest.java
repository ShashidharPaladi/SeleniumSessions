package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmPageTest {

	public static void main(String[] args) {
	
		RegistrationUtil reUt = new RegistrationUtil();
		WebDriver driver = reUt.initDriver("chrome");
		
		reUt.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		System.out.println(reUt.getPageTitle());
		
		By SubDomain = By.id("Form_submitForm_subdomain");
		By Name = By.id("Form_submitForm_Name");
		By Email = By.id("Form_submitForm_Email");
		By PhoneNumber = By.id("Form_submitForm_Contact");
		By COuntry = By.id("Form_submitForm_Country");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(SubDomain, "ssfjhja");
		eleUtil.doSendKeys(Name, "shashi");
		eleUtil.doSendKeys(Email, "shashi@gmail.com");
		eleUtil.doSendKeys(PhoneNumber, "80908221");
		eleUtil.doSendKeys(COuntry, "Inida");
		
		
		
		
		
		
		
		
	}

}
