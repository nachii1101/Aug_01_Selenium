package org.testNGEx4;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx2 {
	@Test
	public void demoQaEx () {
		System.out.println("*** DEMOAQA Sarts***");
		String bName="Chrome";
		GenericUtility gu=new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://demoqa.com");
		System.out.println("*** DEMOQA Ends***");
		//driver.quit();
	}
	@Test
	public void flipkartEx () {
		System.out.println("*** Flipkart Starts***");
		String bName="Chrome";
		GenericUtility gu =  new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://www.flipkart.com");
		System.out.println("*** Flipkart Ends***");
	//	driver.quit();
	}
}
