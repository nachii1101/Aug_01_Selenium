package org.testNGEx3;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"smoke","UAT","regression"})
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
	}
	
	@Test(groups= {"smoke"})
		public void createCustomer() {
		System.out.println("small create customer");
	}
	
	@Test(groups= {"UAT"})
	public void updateCustomer() {
		System.out.println("small update customer");
	}
	
	@Test(groups= {"UAT","regression"})
	public void UpdateCustomer() {
		System.out.println("CAPITAL update customer");
	}
	
	@Test(groups= {"regression"})
	public void CreateCustomer() {
		System.out.println("CAPITAL create customer");
	}
}
