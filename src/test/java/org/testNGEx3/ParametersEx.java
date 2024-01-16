package org.testNGEx3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
	@Test
	@Parameters({"userName","password"})
	public void loginTC(String uName,String pwd) {
		String bName="Chrome";
  		System.out.println("***Program starts***");
  		GenericUtility gu = new GenericUtility();
  		WebDriver driver=gu.startup(bName);
  		driver.get("https://localhost:93/login.do");
  		driver.findElement(By.id("username")).sendKeys(uName);
  		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
  		driver.findElement(By.cssSelector("#loginButton>div")).click();
  		 gu.waitForVisibilityByEletype(driver,30, "id","logoutLink");
  		driver.findElement(By.id("logoutLink")).click();
  		driver.close();
  		System.out.println("***Program Ends***");
  	}

}
