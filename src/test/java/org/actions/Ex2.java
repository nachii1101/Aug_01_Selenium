package org.actions;

import java.time.Duration;

import org.Utilities.GenericUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex2 {
		public static void main (String[] args) {
			System.out.println("***Program Starts***");
			String bName="Chrome";
			GenericUtility gu = new GenericUtility();
			WebDriver driver = gu.startup(bName);
			driver.get("https://demoqa.com/alerts");
			
	//		gu.scrollBypageDown(driver, 1);
			driver.findElement(By.id("timerAlertButton")).click();
			
			//explicit
			
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(5));
			wt.until(ExpectedConditions.alertIsPresent());
			
			Alert alt=driver.switchTo().alert();
			System.out.println("text : " + alt.getText());
			alt.accept();
			
			System.out.println("***Program Ends***");
		}
		
}
