package org.getText_getAttribute;

import java.util.List;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsEx1 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		List<WebElement> uName = driver.findElements(By.xpath("//input[@id='username']"));
		System.out.println("isEmpty : "+uName.isEmpty());
		System.out.println("size : "+uName.size());
		
	}

}
