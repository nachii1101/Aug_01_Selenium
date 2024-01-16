package org.basicProgrammes3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClearKeysEX {

	public static void main(String[] args)  {
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.cssSelector("#edit-record-1>svg")).click();
	//	driver.findElement(By.xpath("//div[text() = 'Cierra']")).click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		// way 1
	//	firstName.clear();
		//Thread.sleep(1000);
	//	firstName.sendKeys("Nachiket");
		
		//way 2
		firstName.click();
		firstName.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		
		firstName.sendKeys(Keys.DELETE);
		firstName.sendKeys("Nachiket");
	}

}
