package org.browserOperations;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;

public class Ex1 {

	public static void main(String[] args)  {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("***Program Ends***");
	}

}
