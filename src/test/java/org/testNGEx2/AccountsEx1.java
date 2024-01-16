package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountsEx1 {
	@BeforeClass
	public void readAccountTestData() {
		System.out.println("Reading Users Test data");
	}
	@AfterClass
	public void clearAccountTestData() {
		System.out.println("Clear Account Test Data");
	}
	@Test
	public void addAccount(){
		System.out.println("Add Account");
	}
	@Test
	public void updateAccount() {
		System.out.println("Update Axxount");
	}
	@Test
	public void DeleteAccount() {
		System.out.println("Delete Account3");
	}
}

