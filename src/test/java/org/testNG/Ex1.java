package org.testNG;

import org.testng.annotations.Test;

public class Ex1 {
  @Test
  public void f() {
	  System.out.println("test case method");
  }
  @Test
  public void test1() {
	  System.out.println("test case method 1");
  }
  public void test() {
	  System.out.println("normal method");//normal method without @Test wont be executed
  }
}