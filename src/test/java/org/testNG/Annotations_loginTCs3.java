package org.testNG;

import java.util.Properties;

import org.PropertiesEX.ConfigReader;
import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_loginTCs3 {
	private WebDriver driver;
	private GenericUtility gu;
	private ConfigReader cr;
	private Properties prop;
	
	@BeforeSuite
	public void init() {
		gu=new GenericUtility();
		cr=new ConfigReader();
		prop=new Properties();
	}
	@AfterSuite
	public void clearObjects() {
		gu=null;
		cr=null;
		prop=null;
	}
	@BeforeMethod
	public void launchBrowser() {
		String bName="Chrome";
		driver=gu.startup(prop.getProperty("bName"));
		driver.get(prop.getProperty("URL"));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@Test
	public void verifyLoginTitle() {
	if(driver.getTitle().equals("actiTime - Enter Time Track")) {
		System.out.println("Title is as expected");
	} else {
		System.out.println("Title is not as expected");
	}
	}
	@Test
	public void verifyLoginURL() {
		if(driver.getCurrentUrl().equals(prop.getProperty("URL"))) {
			System.out.println("URL is as expected");
			}else {
				System.out.println("URL is not as expected");
			}
		}
	@Test
	public void verifyLoginPageFields() {
	System.out.println(	driver.findElement(By.xpath("//input[@id='username']")).isDisplayed());
	System.out.println(driver.findElement(By.cssSelector(".textFiled.pwdfield")).isDisplayed());
	System.out.println(driver.findElement(By.xpath("div[text()='Login ']")).isDisplayed());
		}
	@Test
	public void verifyLoginFuctionality() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("uName"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		gu.waitForVisibilityByEletype(driver, 10, "cssSelector", "#logoutLink");
		driver.findElement(By.cssSelector("#logoutLink")).click();
		
	}
}
