package org.actions;

import org.Utilities.GenericUtility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex1 {
		public static void main (String[] args) {
			System.out.println("***Program Starts***");
			String bName="Chrome";
			GenericUtility gu = new GenericUtility();
			WebDriver driver = gu.startup(bName);
			driver.get("https://demoqa.com/alerts");
			
			gu.scrollBypageDown(driver, 1);
			driver.findElement(By.id("promtButton")).click();
			
			//Way 1
			/*Alert alt = driver.switchTo().alert();
			System.out.println("Text : "+alt.getText());
			alt.sendKeys("Aug 1 batch");
			alt.dismiss();*/
			
			//Way2
			String text=driver.switchTo().alert().getText();
			System.out.println("Text : "+text);
			driver.switchTo().alert().sendKeys("Aug 1 batch");
			driver.switchTo().alert().accept();
		//	driver.switchTo().alert().dismiss();
			
			System.out.println("***Program Ends***");
		}
		
}
