package org.basicProgrammes3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickBy_J_S {

	public static void main(String[] args) {
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		//login code
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
	//	driver.findElement(By.cssSelector("#loginButton>div")).click();
		
		WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
		
	//	JavascriptExecutor js =(JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click", loginBtn);
		
		gu.clickByJS(driver, loginBtn);
		
		//logout code
		driver.findElement(By.id("#logoutLink")).click();

	}

}
