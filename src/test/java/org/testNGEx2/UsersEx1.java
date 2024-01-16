package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UsersEx1 {
	@BeforeClass
	public void readUsersTestData() {
		System.out.println("Reading Users Test data");
	}
	@AfterClass
	public void clearUsersTestData() {
		System.out.println("Clear USer Test Data");
	}
	@Test
	public void addUsers(){
		System.out.println("Add Users");
	}
	@Test
	public void updateUsers() {
		System.out.println("Update Users");
	}
	@Test
	public void DeleteUsers() {
		System.out.println("Delete Users");
	}
}

