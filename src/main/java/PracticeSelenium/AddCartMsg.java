package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCartMsg {

	public static void main(String[] args) {
		

		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=product/product&product_id=45&search=macbook");
		ElementUtil eleUtil = new ElementUtil(driver);

		By Linktext = By.xpath("//div[@id='product-product']/div[@class='alert alert-success alert-dismissible']");
		
		System.out.println(eleUtil.doGetText(Linktext));
	}

}
