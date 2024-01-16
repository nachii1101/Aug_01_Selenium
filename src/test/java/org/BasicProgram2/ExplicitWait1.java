package org.BasicProgram2;

import java.time.Duration;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {
	//work only for logout link
//	public void WaitForVisibilityBy(Webdriver driver) {
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(50));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logoutLink")));
		
//	}
	public static void main (String[] args){
		System.out.println("Starts");
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
	
		driver.get("http://localhost:93/login.do");
	
		//Login code
		driver.findElement(By.xpath("//input[@Id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//logout
	//	driver.findElement(By.className("#logoutLink")).click();
		
		//Explicit wait
		//WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds(50));
		//way 1
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));
	//	gu.waitforVisibilityBy(driver, 50,"cssSelector", "#logoutLink ");
		driver.findElement(By.cssSelector("#logoutLink")).click();
		System.out.println("Ends");
	}
}
