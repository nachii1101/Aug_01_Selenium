
package org.Assertions;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx2 {
	@Test
	public void test1() {   
		System.out.println("Test 1 Starts");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of a : 1");

		System.out.println("Test 2 Ends");
		int a = scn.nextInt();
		scn.close();
	//	Assert.assertEquals(a, 10);
		Assert.assertEquals(a,10,"'a' should be 10");
		System.out.println("---equals executed---");
		
		String str="Pune";
		Assert.assertNotEquals(str, "Mumbai");
	//	Assert.assertEquals(str,"Pune","Strings are matching");
		System.out.println("---NOT equals executed---");
		
		int[] ar= {50,20,-10,40};
		Assert.assertTrue(ar.length!=0);
		System.out.println("---true executed---");
		
		Assert.assertFalse(ar.length==0);
		System.out.println("---False executed---");
		
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
