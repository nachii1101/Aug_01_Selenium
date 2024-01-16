package org.BasicProgram2;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginActiTime3DashBoardURL  {
		
			public static void main(String[] args) {
				String bName = "Chrome";
				GenericUtility gu = new GenericUtility();
				WebDriver driver = gu.startup(bName);
				
				driver.get("http://localhost:93/login.do");
			
				//Login code
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
				//verify dashboard url
				String actURL = driver.getCurrentUrl();
				String expURL ="http://localhost:93/user/submit_tt.do";
				if(actURL.equals(expURL)) {
					System.out.println("URL is as expected");
				}else{
					System.out.println("URL is not as expected");
				}
				//verify dashboard titlt
				String actTitle=driver.getTitle();
				String expTitle="actiTIME - Enter Time-Track";
				if(actTitle.equals(expTitle)) {
					System.out.println("Title is as expected");
				}else {
					System.out.println("Title is not as expected");
				}

		}

}
