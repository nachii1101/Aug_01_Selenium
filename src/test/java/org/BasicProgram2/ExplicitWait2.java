package org.BasicProgram2;

import java.time.Duration;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
	
	public static void main (String[] args){
		System.out.println("Starts");
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
	
		driver.get("http://localhost:93/login.do");
	
		//Login cod
		driver.findElement(By.xpath("//input[@Id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
	// way 1 give  error at line 27
	//	WebElement logoutlink = driver.findElement(By.cssSelector("#logoutLink"));//agar yaha pe implicit wait
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOf(logoutlink));
		
		//way 2
//		WebDriverWait wait = new webDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#logoutLink"))));
		System.out.println("***ENDS***");
	}
}
