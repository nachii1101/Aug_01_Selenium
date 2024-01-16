package org.testNG;

import org.testng.annotations.Test;

public class Ex2 {
  @Test
  public void testcaseMethod1() {
	  System.out.println("test case method 1");
  }
 // @Test
  public void testMethod2() {
	  System.out.println("test case method 2");
  }
  @Test
  public void testMethod3() {
	  System.out.println("test case method 3");
	  testMethod2();//we call above NS method in this test case
	  //total test run are testmethod 1 and 3
	  //this wont be sequentially executed
  }
}