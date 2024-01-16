package org.POM_TestCases;

import java.sql.Driver;

import org.POM_Page.DashboardPage;
import org.POM_Page.LoginPage;
import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DashboardTC {
	private WebDriver driver;
	@BeforeMethod
	public void login(){
		String bName="Chrome";
  		GenericUtility gu = new GenericUtility();
  		WebDriver driver=gu.startup(bName);
  		driver.get("https://localhost:93/login.do");
  		LoginPage lpObj = new LoginPage(driver);
  		lpObj.enterUsername("admin");
  		lpObj.enterPassword("manager");
  		lpObj.clickOnLoginBtn();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void verifyDashboardTitle() {
		DashboardPage dpObj=new DashboardPage(driver);
		Reporter.log("Dashboard Page title displayed as : "+dpObj.getDashboardPageTitle());
		Assert.assertEquals(dpObj.getDashboardPageTitle(), "");
		Reporter.log("Dashboard Page title is as expected");
	}
	
	@Test
	public void verifyDashboardPageURL() {

	}
	
	@Test
	public void verifyDashboardDisplays4Tabs() {

	}
	
	@Test
	public void verifyDashboardPageTimeTrackTabsIsSelected() {

	}
}
