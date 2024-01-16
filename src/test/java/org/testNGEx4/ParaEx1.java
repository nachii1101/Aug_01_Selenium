package org.testNGEx4;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx1 {
	@Test
	public void googleEx() {
		System.out.println("***Google Sarts***");
		String bName="Chrome";
		GenericUtility gu=new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://www.google.com");
		System.out.println("***Google Ends***");
		//driver.quit();
	}
	@Test
	public void FacebookEx() {
		System.out.println("Facebook Starts***");
		String bName="Chrome";
		GenericUtility gu=new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://www.facebook.com");
		System.out.println("***Facebook Ends***");
	//	driver.quit();
	}
}
