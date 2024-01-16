package org.basicProgrammes3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollEX1 {

	public static void main(String[] args)  {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement ele = driver.findElement(By.id("uploadPicture"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		System.out.println("***Program Ends***");
	}

}
