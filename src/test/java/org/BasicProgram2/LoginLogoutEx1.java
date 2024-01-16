package org.BasicProgram2;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLogoutEx1  {
		
			public static void main(String[] args) {
				System.out.println("***Program Starts");
				String bName = "Chrome";
				GenericUtility gu = new GenericUtility();
				WebDriver driver = gu.startup(bName);
				System.out.println("***Program Ends***");
				
				
//				driver.get("http://localhost:93/login.do");
			
				//Login code
				driver.findElement(By.xpath("//input[@Id='username']")).sendKeys("admin");
				driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
				
				//Login code
				driver.findElement(By.cssSelector("#logoutLink")).click();//after stopping actitime and starting it again
				
				//in real there won't be starting and stopping
				//you would be running the url on the different environments
				//whenever you will write the cases make sure you run it for 4-5 times	
		}

}
