package org.framehandling;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex3 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https:demoqa.com/frames");
		
		//There are 3 ways to switch inside the frame
		//Way 1 by using frame Webelement
		//WebElement frameEle1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		
		//Way2 by using frame index not recommanded
	//	driver.switchTo().frame(3);
		
		//way 3 by using frame ID/name
	//	driver.switchTo().frame("frame1");
		
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		System.out.println("Text :"+ele.getText());
		
		System.out.println("***Program Ends***");
	}

}
