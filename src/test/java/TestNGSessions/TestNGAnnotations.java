package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/**
	 * [RemoteTestNG] detected TestNG version 6.14.3
		BS - connectionwithDb
		BT - createUser
		BC - launchBrowser
			BM - logintoApp
			SearchTest
			AM - logout
			
			BM - logintoApp
			homepageHeaderTest
			AM - logout
			
			BM - logintoApp
			homepageTitleTest
			AM - logout
		
		AC - closeBrowser
		AT - deleteUser
		
		PASSED: SearchTest
		PASSED: homepageHeaderTest
		PASSED: homepageTitleTest

		===============================================
		    Default test
		    Tests run: 3, Failures: 0, Skips: 0
		===============================================
		
		AS - disconnectwithDB
		
		===============================================
		Default suite
		Total tests run: 3, Failures: 0, Skips: 0
		===============================================


	 */
	
	@BeforeSuite
	public void connectionwithDb() {
		System.out.println("BS - connectionwithDb");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT - createUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC - launchBrowser");
	}
	
	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM - logintoApp");
	}
	
	
	@Test
	public void homepageHeaderTest() {
		System.out.println("homepageHeaderTest");
	}
	
	@Test
	public void homepageTitleTest() {
		System.out.println("homepageTitleTest");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("SearchTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM - logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC - closeBrowser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT - deleteUser");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS - disconnectwithDB");
	}
	
	
}
