package org.testNGEx4;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ParaEx3 {
	@Test
	public void automationTesting () {
		System.out.println("*** automationTesting Sarts***");
		String bName="Chrome";
		GenericUtility gu=new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://automationintesting.com");
		System.out.println("*** automationTesting Ends***");
		//driver.quit();
	}
	
}
