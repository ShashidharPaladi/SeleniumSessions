package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HrefAttributeValue {

	public static void main(String[] args) {
		
		
		
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.amazon.in/ref=nav_logo");

		ElementUtil eleUtil = new ElementUtil(driver);
		
//		String url = driver.findElement(By.linkText("About Us")).getAttribute("href");
//		System.out.println(url);
		
//		By linkText = By.linkText("About Us");
//		System.out.println(eleUtil.doGetAttributeValue(linkText, "href"));
		
//		By Tag = By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a");
//		System.out.println(eleUtil.doGetAttributeValue(Tag, "href"));
		
//		String source = driver.findElement(By.xpath("//img[@alt='SYANKA Glass Wine Glass - Set Of 4, Clear, 360ml']")).getAttribute("src");
//		System.out.println(source);
		
//		By source =By.xpath("//img[@alt='SYANKA Glass Wine Glass - Set Of 4, Clear, 360ml']");
//		System.out.println(eleUtil.doGetAttributeValue(source, "src"));
		
//		By text = By.linkText("About Us");
//		System.out.println(eleUtil.doGetAttributeValue(text, "href"));
		
		By source = By.xpath("//img[@alt='(Renewed) Ultimate Ears Boom 3 Wireless Bluetooth Portable Speaker (Sunset Red)']");
		System.out.println(eleUtil.doGetAttributeValue(source, "src"));
		System.out.println(eleUtil.doGetAttributeValue(source, "class"));
		
//		br.quitBrowser();
		
		
		
		
	}

}
