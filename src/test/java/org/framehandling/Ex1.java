package org.framehandling;

import java.time.Duration;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https:demoqa.com/frames");
		
		//switch to frame
		WebElement frameEle1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameEle1);
		
		//explicit wait if your iframe is taking time to load
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
		
		WebElement ele=driver.findElement(By.id("sampleHeading"));
		System.out.println("Text :"+ele.getText());
		
		System.out.println("***Program Ends***");
	}

}
