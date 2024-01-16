package org.getText_getAttribute;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeDashboardTab {

	public static void main(String[] args) {
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		gu.waitForVisibilityBy(driver, 10, "cssSelector", "#logoutLink");
		
		WebElement ttTabLink = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
		String value = ttTabLink.getAttribute("class");
		System.out.println(value);
		
		WebElement ttTab = driver.findElement(By.cssSelector("tr>td[class^='navItem navCell']:nth-child(2)"));
		String text = ttTab.getText();
		System.out.println(text);
   }
}
