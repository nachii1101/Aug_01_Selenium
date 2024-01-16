package org.testNG;

import org.testng.annotations.Test;

public class Sequence { //when there are multiple test cases they are executed according to the ascii values/
  @Test					//uppercase= 65 to 90 and lowercase = 97 to 122
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void logout() {
	  System.out.println("logout");
  }
  @Test
  public void createCustomer() {
	  System.out.println("small create customer");
  }
  @Test
  public void updateCustomer() {
	  System.out.println("small update customer");
  }
}
