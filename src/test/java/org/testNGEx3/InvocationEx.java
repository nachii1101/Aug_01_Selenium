package org.testNGEx3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class InvocationEx {
	@Test(invocationCount=5,threadPoolSize=2)
	public void loginTC() {
	System.out.println("***Program starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("https://localhost:93/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		 gu.waitForVisibilityByEletype(driver,30, "id","logoutLink");
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		System.out.println("***Program Ends***");
}
}