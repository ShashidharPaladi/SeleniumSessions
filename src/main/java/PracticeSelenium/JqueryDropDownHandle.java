package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JqueryDropDownHandle {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();

		WebDriver driver = br.initDriver("Chrome");
		br.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@id='comboTree97019DropDownContainer']//child::span[contains(text(),'choice')]"));
//				driver.findElements(By.xpath("//div[@id='comboTree347678DropDownContainer']//span[@class='comboTreeItemTitle']"));
//				driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//				driver.findElements(By.xpath("//div[@id='comboTree347678DropDownContainer']//input[@type='checkbox']"));
//				driver.findElements(By.xpath("//div[@id='comboTree97019DropDownContainer']/ul//span"));
//				driver.findElements(By.xpath("//div[@id='comboTree97019DropDownContainer']//span"));
		
		System.out.println(choiceList.size());
		
		for(WebElement e : choiceList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		
		
		
		
		

	}

}
