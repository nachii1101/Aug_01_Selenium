package org.testNG;

import org.testng.annotations.Test;

public class Priority1 {
	@Test(priority = 11)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 5)
	public void logout() {
		System.out.println("logout");
	}
	
	@Test(priority = -11)
		public void createCustomer() {
		System.out.println("small create customer");
	}
	
	@Test(priority = 0)
	public void updateCustomer() {
		System.out.println("small update customer");
	}
	
	@Test(priority = 110)
	public void UpdateCustomer() {
		System.out.println("CAPITAL update customer");
	}
	
	@Test(priority = 0)
	public void CreateCustomer() {
		System.out.println("CAPITAL create customer");
	}
}
