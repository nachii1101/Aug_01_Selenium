package org.Assertions;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TitleURLEx {
	@Test
	public void verifyDashboardTitleURL_HARD() {
		System.out.println("Program Starts");
	
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("http://localhost:93/login.do");
	
		//Login code
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		gu.waitForTitleContains(driver, 10,"Enter Time-Track");
		//verify dashboard url
		Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:93/user/submit_tt.do" );
		
		System.out.println("*****");
		//verify dashboard title
		Assert.assertEquals(driver.getTitle(),"actiTIME - Enter Time-Track" );
		
		System.out.println("Program Ends`");
		

}
	@Test
	public void verifyDashboardTitleURL_SOFT() {
		System.out.println("Program Starts");
		SoftAssert sa = new SoftAssert();
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		
		driver.get("http://localhost:93/login.do");
	
		//Login code
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		gu.waitForTitleContains(driver, 10,"Enter Time-Track");
		//verify dashboard url
		sa.assertEquals(driver.getCurrentUrl(),"http://localhost:93/user/submit_tt.do" );
		
		System.out.println("*****");
		//verify dashboard title
		sa.assertEquals(driver.getTitle(),"actiTIME - Enter Time-Track" );
		
		System.out.println("Program Ends`");
		sa.assertAll();

}
	}

