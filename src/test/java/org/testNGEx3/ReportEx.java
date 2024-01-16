package org.testNGEx3;

import org.PropertiesEX.ConfigReader;
import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

class ReportEx {
	@Test
	public void login() {
		Reporter.log("Login Test Case");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		ConfigReader cr = new ConfigReader();
		WebDriver driver=gu.startup(bName);
		driver.findElement(By.id("username")).sendKeys(cr.getPropData("uName"));
		Reporter.log("User name entered as : "+cr.getPropData("uName"));
		
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(cr.getPropData("pwd"));
		Reporter.log("Password entered.");
		
  		driver.findElement(By.cssSelector("#loginButton>div")).click();
  		Reporter.log("Clicked on login button");
	}
	@Test
	public void logout() {
		Reporter.log("logout Test Case");
		String str="Pune";
		Reporter.log("charAT : "+ str.charAt(4));
	}
}
