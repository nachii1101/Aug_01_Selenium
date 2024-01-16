package org.testNG;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WO_Annotations_loginTcs {
  @Test
  public void verifyLoginTitle() {
	  String bName="Chrome";
	  GenericUtility gu = new GenericUtility();
	  WebDriver driver = gu.startup(bName);
	  driver.get("http://localhost:93/login.do");
	  if(driver.getTitle().equals("actiTime - Enter Time-Track")) {
		  System.out.println("Title is as expected");
	  } else {
		  System.out.println("Title is not as expected");
	  }
	  driver.close();
  }
  @Test
  public void verifyLoginURL() {
	  String bName="Chrome";
	  GenericUtility gu = new GenericUtility();
	  WebDriver driver = gu.startup(bName);
	  driver.get("http://localhost:93/login.do");
	  if(driver.getCurrentUrl().equals("http://localhost:93/login.do")) {
		  System.out.println("URL is as expected");
	  } else {
		  System.out.println("URL is not as expected");
	  }
	  driver.close();
  }
  @Test
  public void verifyLoginPageFields() {
	  String bName="Chrome";
	  GenericUtility gu = new GenericUtility();
	  WebDriver driver = gu.startup(bName);
	  driver.get("http://localhost:93/login.do");
	  System.out.println(driver.findElement(By.xpath("//input[@id='username']")).isDisplayed());
	  driver.findElement(By.cssSelector(".textField.pwdfield")).isDisplayed();
	  driver.findElement(By.xpath("//div[text()='Login ']")).isDisplayed();
	  driver.close();
  }
}
