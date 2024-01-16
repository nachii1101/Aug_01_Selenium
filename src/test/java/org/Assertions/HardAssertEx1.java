package org.Assertions;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx1 {
	@Test
	public void test1() {
		System.out.println("Test 1 Starts");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a : ");

		System.out.println("Test 2 Ends");
		int a = scn.nextInt();
		Assert.assertEquals(a, 10);
		System.out.println("Test 1 Ends");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 Starts");

		System.out.println("Test 2 Ends");
	}

	@Test
	public void test3() {
		System.out.println("Test 3 Starts");

		System.out.println("Test 3Ends");
	}
}
