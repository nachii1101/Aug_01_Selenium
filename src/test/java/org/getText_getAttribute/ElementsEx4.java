package org.getText_getAttribute;

import java.util.List;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsEx4 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	//	driver.findElement(By.cssSelector("logoutLink")).click();
	//	gu.waitForVisibilityBy(driver, 20, "cssSelector", "#logoutLink");
		
		driver.findElement(By.cssSelector("tr>td[class^='navItem navCell']:nth-child(4)")).click();
		List<WebElement> tabNames = driver.findElements(By.cssSelector("tr>td[class^='navItem navCell'] .label"));
		System.out.println("tabNames :"+tabNames);
		List<WebElement> tabLinks = driver.findElements(By.cssSelector("tr>td[class^='navItem navCell'] a"));
		
//		for(int i=0;i<tabNames.size();i++) {
//			WebElement ele = tabLinks.get(i);
//			String value = ele.getAttribute("class");
//			if(value.contains("selected")) {
//				System.out.println("Selected : " +tabNames.get(i).getText());
//			}else {
//				System.out.println("Not Selected : " + tabNames.get(i).getText());
			}
//		}
//	}
}
