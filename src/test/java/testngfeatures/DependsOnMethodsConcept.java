package testngfeatures;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
//	@Test
//	public void loginTest() {
//		System.out.println("login test");
//		int i = 9/0;
//	}
//	
//	@Test(dependsOnMethods = "loginTest")
//	public void homepageTest() {
//		System.out.println("homepage test");
//	}
//	
//	@Test(dependsOnMethods = "loginTest")
//	public void searchTest() {
//		System.out.println("search test");
//	}
	
	
	//CRUD
	
	public void userCreate(String name, int age) {
		System.out.println(name +" " + age);
	}
	
	public void updateCreate(String name, int age) {
		System.out.println(name +" " + age);
	}
	
	public void deleteUser(String name, int age) {
		System.out.println(name +" " + age);
	}
	
	public void getUser(String name) {
		System.out.println(name);
	}
	
//	@Test
//	public void CreateUserTest() {
//		System.out.println("Create user");
//		userCreate("tom", 25);
//	}
//	
//	@Test(dependsOnMethods = "CreateUserTest")
//	public void UpdateUserTest() {
//		System.out.println("Create user");
//		updateCreate("tom", 30);
//	}
	
	@Test
	public void CreateUserTest() {
		System.out.println("Create user");
		userCreate("tom", 25);
	}
	
	@Test
	public void UpdateUserTest() {
		System.out.println("update user");
		userCreate("tom", 25);
		updateCreate("tom", 30);
	}
	
	@Test
	public void DeleteUserTest() {
		System.out.println("delete user");
		userCreate("peter", 25);
		deleteUser("peter", 25);
	}
	
	@Test
	public void getUserTest() {
		System.out.println("get user");
		userCreate("lisa", 25);
		getUser("lisa");
	}
	

}
