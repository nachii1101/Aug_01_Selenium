package org.getText_getAttribute;

import java.time.Duration;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTitleURl {

	public static void main(String[] args) {
	String bName="chrome";
	GenericUtility gu = new GenericUtility();
	WebDriver driver = gu.startup(bName);
	driver.get("http://localhost:93/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
//	gu.waitForVisibilityBy(driver, 10, "cssSelector", "#logoutLink");
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.urlContains("submit_tt.do"));
	//wait.until(ExpectedConditions.urlToBe("http://localhost:93/user/submit_tt.do"));
	
	gu.waitForURlContains(driver, 30, "submit_tt.do");
	if(driver.getCurrentUrl().equals("http://localhost:93/user/submit_tt.do")) {
		System.out.println("URL is as expected");
	}else {
		System.out.println("URL is not as expected");
	}
	gu.waitForTitleContains(driver, 30,"Enter Time-Track");
	if(driver.getTitle().equals("actitime - Enter Time-Track")) {
		System.out.println("Title is as expected");
	}else {
		System.out.println("Title is not as expected");
	}
	
	}
}
