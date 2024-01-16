package org.basicProgrammes3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiveWebElementEx {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://demoqa.com/automation-practice-form");
		
		//gu.scrollBy(driver,subjectField);
		//Thread.sleep(1000);
		//subjectField.sendkeys(Keys.TAB);
		
//		WebElement ele = driver.switchTo().activeElement();
	//	ele.sendKeys(Keys.SPACE);
	driver.switchTo().activeElement().sendKeys(Keys.SPACE);
	
	System.out.println("***Program Ends***");
		
		

	}

}
