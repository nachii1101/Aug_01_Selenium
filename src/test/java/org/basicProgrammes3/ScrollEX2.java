package org.basicProgrammes3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollEX2 {

	public static void main(String[] args)  {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://demoqa.com/webtables");
		
//		WebElement ele = driver.findElement(By.xpath("//html"));
//		ele.sendKeys(Keys.PAGE_DOWN);
		
		//OR
		//gu.scrollByPageDown(driver,1);
		
		System.out.println("***Program Ends***");
	}

}
