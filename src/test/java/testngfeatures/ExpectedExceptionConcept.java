package testngfeatures;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name = "JAVA";
	
	@Test(expectedExceptions = {NullPointerException.class, ArithmeticException.class})
	public void createUserTest() {
		System.out.println("create user test");
		int i = 9/0;
		
	ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
	obj = null;
	System.out.println(obj.name);
		
	}
	
	@Test(expectedExceptions = Exception.class)
	public void UserTest() {
		System.out.println("user test");
		int i = 9/0;
		
	ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
	obj = null;
	System.out.println(obj.name);
		
	}

}
