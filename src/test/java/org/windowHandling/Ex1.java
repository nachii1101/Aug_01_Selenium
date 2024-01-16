package org.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://demoqa.com/browser-windows");
		
		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		String parentId2 = driver.getWindowHandle();
		
		System.out.println("parentId1 : " + parentId1);
		System.out.println("parentId2 : " + parentId2);
		
		Set<String> allWinds = driver.getWindowHandles();
		Iterator<String> itr = allWinds.iterator();
		
		String id = itr.next();
		if(id.equals(parentId1)) {
			id=itr.next();
			driver.switchTo().window(id);
		}
	}
}
