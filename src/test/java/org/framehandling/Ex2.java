package org.framehandling;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https:demoqa.com/frames");
		
		WebElement frameEle1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameEle1);
		
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text :"+ele.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement ele2=driver.findElement(By.id("sampleHeading"));
		System.out.println("Text2 :"+ele2.getText());
		
		System.out.println("***Program Ends***");
	}

}
