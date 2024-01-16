package org.testNGEx3;

import org.testng.annotations.Test;

public class EnabledEx {
	@Test(enabled=true)
	public void createUser() {
		System.out.println("Create User");
	}
	@Test
	public void updateUser() {
		System.out.println("Update User");
	}
	@Test(enabled=false)
	public void deleteUser() {
		System.out.println("Delete User");
	}
}
