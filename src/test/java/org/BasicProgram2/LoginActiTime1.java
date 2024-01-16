package org.BasicProgram2;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActiTime1  {
		
			public static void main(String[] args) {
				String bName = "Chrome";
				GenericUtility gu = new GenericUtility();
				WebDriver driver = gu.startup(bName);
				
				driver.get("http://localhost:93/login.do");
				
			//	By byusernameobj= By.xpath("//input[@id='username']");
			//	driver.findElement(byusernameobj);
				//oR
				WebElement userNameField = driver.findElement(By.xpath("//input[@id='username']"));
				
			//	By bypwdobj= By.xpath("//input[@id='username']");
			//	driver.findElement(bypwdobj);
				//oR
				WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
				WebElement loginBtn = driver.findElement(By.xpath("div[text()='Login']"));
	}
			

}
