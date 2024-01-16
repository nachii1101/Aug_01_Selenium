package org.getText_getAttribute;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EX1 {

	public static void main(String[] args) {
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		WebElement tt = driver.findElement(By.cssSelector("[class='item active']"));
		String text=tt.getText();
		System.out.println(text);
		
		String value = tt.getAttribute("class");
		System.out.println(value);

	}
}
