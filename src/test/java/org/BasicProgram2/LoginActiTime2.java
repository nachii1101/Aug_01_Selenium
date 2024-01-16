package org.BasicProgram2;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActiTime2  {
		
			public static void main(String[] args) {
				String bName = "Chrome";
				GenericUtility gu = new GenericUtility();
				WebDriver driver = gu.startup(bName);
				
				driver.get("http://localhost:93/login.do");
			
//		WebElement userNameField = driver.findElement(By.xpath("//input[@id='username']"));
//		userNameField.sendKeys("admin");
		
//		WebElement pwdField = driver.findElement(By.xpath("//input[@class='textField pwdfield']"));
//	pwdField.sendKeys("manager");
		
//		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
//		loginBtn.click();
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("managerccx");
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		}

}

