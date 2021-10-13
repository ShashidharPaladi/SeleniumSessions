package testngfeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestEnableDisable {
	
	@Test
	public void CreateUserTest() {
		System.out.println("Create user");
	}
	
	@Test
	public void UpdateUserTest() {
		System.out.println("update user");
	}
	
	@Test(enabled = false)
	public void DeleteUserTest() {
		System.out.println("delete user");
	}
	
	@Ignore
	@Test(enabled = true, description = "get the user data")
	public void GetUserTest() {
		System.out.println("get user");
	}

}
