package org.POM_TestCases;

import org.POM_Page.LoginPage;
import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTC {
	private WebDriver driver;
	@BeforeMethod
	public void init() {
		String bName="Chrome";
  		GenericUtility gu = new GenericUtility();
  		 driver=gu.startup(bName);
  		driver.get("http://localhost:93/login.do");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void verifyLoginPageFields() {
		//	String bName="Chrome";
	  	//	GenericUtility gu = new GenericUtility();
	  	//	WebDriver driver=gu.startup(bName);
	  	//	driver.get("https://localhost:93/login.do");
	  		LoginPage lpObj = new LoginPage(driver);
	  		SoftAssert sa = new SoftAssert();
	  		sa.assertTrue(lpObj.isUserNameFieldDisplayed(),"username field is not dispalyed");
	  		sa.assertTrue(lpObj.isPasswordFieldDisplayed(),"Password field is not dispalyed");
	  		sa.assertTrue(lpObj.iskeepMeLoginChkBoxDisplayed(),"KeepMeLogin checkbox is not dispalyed");
	  		sa.assertTrue(lpObj.isloginBtnDisplayed(),"Login button is not displayed");
	  		sa.assertTrue(lpObj.isloginLogosDisplayed(),"Login logos are not displayed");
	  		sa.assertAll();
	  		Reporter.log("Login page fields are displayed as expected");
	}
	
	@Test
	public void verifyLoginFuctionality() throws InterruptedException {
	//	String bName="Chrome";
  	//	GenericUtility gu = new GenericUtility();
  	//	WebDriver driver=gu.startup(bName);
  	//	driver.get("https://localhost:93/login.do");
  		LoginPage lpObj = new LoginPage(driver);
  		lpObj.enterUsername("admin");
  		lpObj.enterPassword("manager");
  		lpObj.clickOnLoginBtn();
  		Thread.sleep(1000);
  		Assert.assertTrue(lpObj.isTimeTrackTabDisplayed());
  		Reporter.log("Login succesfull");
  		
	}
	@Test
	public void verifyLoginPageTitle() {
		LoginPage lpObj = new LoginPage(driver);
		Reporter.log("Login Page Title is displayed as : "+lpObj.getLoginPageTitle());
		Assert.assertEquals(lpObj.getLoginPageTitle(),"actiTIME - Login");
		Reporter.log("Login Page Title is expected");
	}
	
	@Test
	public void verifyLoginPageURL() {
		LoginPage lpObj = new LoginPage(driver);
		Reporter.log("Login Page Title is displayed as : "+lpObj.getLoginPageURL());
		Assert.assertEquals(lpObj.getLoginPageURL(),"http://localhost:93/login.do"); 
		Reporter.log("Login Page URL is expected");
	}
	
}
