package org.testNGEx3;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
  @DataProvider
  public Object[][] loginTestData(){
	  Object[][] ar = new Object[4][2];
	  
	  ar[0][0]="admin";
	  ar[0][1]="manager";
	  
	  ar[1][0]="admin123";
	  ar[1][1]="manager";
	  
	  ar[2][0]="admin";
	  ar[2][1]="manager123";
	  
	  ar[3][0]="admin123";
	  ar[3][1]="manager123";
	  
	  return ar;
  }
  	@Test(dataProvider="loginTestData")
  	public void loginTC(String uName,String pwd) {
  		System.out.println("***Program starts***");
  		String bName="Chrome";
  		GenericUtility gu = new GenericUtility();
  		WebDriver driver=gu.startup(bName);
  		driver.get("https://localhost:93/login.do");
  		driver.findElement(By.id("username")).sendKeys(uName);
  		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(pwd);
  		driver.findElement(By.cssSelector("#loginButton>div")).click();
  		gu.waitForVisibilityBy(driver,5, "id","logoutLink");
  		driver.findElement(By.id("logoutLink")).click();
  		driver.close();
  		System.out.println("***Program Ends***");
  	}
}
