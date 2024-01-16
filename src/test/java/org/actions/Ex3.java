package org.actions;

import org.Utilities.GenericUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex3 {
		public static void main (String[] args) {
			System.out.println("***Program Starts***");
			String bName="Chrome";
			GenericUtility gu = new GenericUtility();
			WebDriver driver = gu.startup(bName);
			driver.get("https://demoqa.com/alerts");
			
			gu.scrollBypageDown(driver, 1);
			
			
		    driver.findElement(By.id("confirmButton")).click();
		    String text = driver.switchTo().alert().getText();
		    System.out.println("text : " + text);
		    driver.switchTo().alert().accept();
			
			System.out.println("***Program Ends***");
		}
		
}
