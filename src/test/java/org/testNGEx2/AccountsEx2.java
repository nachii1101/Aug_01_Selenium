package org.testNGEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountsEx2 {
/*	@BeforeClass
	public void readAccountTestData() {
		System.out.println("Reading Users Test data");
	}
	@AfterClass
	public void clearAccountTestData() {
		System.out.println("Clear Account Test Data");
	}*/
	@BeforeTest
	public void GetDevDetails() {
		System.out.println("Get Dev environment details");
	}
	@AfterTest
	public void clearDevEnvironment() {
		System.out.println("Clear Dev Environment details");
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

