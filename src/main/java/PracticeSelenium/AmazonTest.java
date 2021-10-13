package PracticeSelenium;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		br.initDriver("chrome");
		br.launchUrl("http://www.amazon.com");
		System.out.println("url is launched....");
		String title = br.getPageTitle();
		System.out.println("page title is: "+title);
		System.out.println(br.getPageUrl());
		br.quitBrowser();
		
		
		
		
		
		
		

	}

}
