package org.PropertiesEX;

import java.util.Properties;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiTimeLoginEx2 {

	public static void main(String[] args) {
		System.out.println("***Program Starts***");
		ConfigReader cr = new ConfigReader();
		Properties prop = cr.getprop();
		
		GenericUtility gu = new GenericUtility();
		
		//WebDriver driver = gu.startup(prop.getProperty("bName"),prop.getProperty("URl"));
		WebDriver driver=gu.startup(cr.getPropData("bName"));
		driver.get(cr.getPropData("URL"));
		//login code
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(cr.getPropData("uName"));
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(cr.getPropData("pwd"));
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		System.out.println("***Program Ends***");
	}

}
