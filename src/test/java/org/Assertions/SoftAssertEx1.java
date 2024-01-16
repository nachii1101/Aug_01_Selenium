package org.Assertions;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx1 {
	@Test
	public void test1() {
		System.out.println("Test 1 Starts");
		SoftAssert sa = new SoftAssert();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a : 1");

		
		int a = scn.nextInt();
		scn.close();
	//	sa.assertEquals(a, 10);
		sa.assertEquals(a,10,"'a' should be 10");
		System.out.println("---equals executed---");
		
		String str="Pune";
	//	sa.assertNotEquals(str, "Mumbai");
		sa.assertEquals(str,"Pune","Strings are matching");
		System.out.println("---NOT equals executed---");
		
		int[] ar= {50,20,-10,40};
		sa.assertTrue(ar.length!=0);
		System.out.println("---true executed---");
		
		sa.assertFalse(ar.length==0);
		System.out.println("---False executed---");
		System.out.println("Test 1 Ends");
		sa.assertAll();
		
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
