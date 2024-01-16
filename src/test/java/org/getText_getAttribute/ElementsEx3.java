package org.getText_getAttribute;

import java.util.List;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsEx3 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver=gu.startup(bName);
		driver.get("http://localhost:93/login.do");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		//gu.waitForVisibilityBy(driver, 20, "cssSelector", "#logoutLink");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		List<WebElement> tabNames = driver.findElements(By.cssSelector("tr>td[class^='navItem navCell'] .label"));
		List<WebElement> tabLinks = driver.findElements(By.cssSelector("tr>td[class^='navItem navCell'] a"));
		int size = tabNames.size();
		for(int i=0;i<size;i++) {
			WebElement ele=tabNames.get(i);
			String value = ele.getAttribute("class");
			if(value.contains("selected")) {
				System.out.println("Selected : "+tabNames.get(i).getText());
			}else {
				System.out.println("Not Selected : "+tabNames.get(i).getText());
			}
			
	}
	
	}
}
