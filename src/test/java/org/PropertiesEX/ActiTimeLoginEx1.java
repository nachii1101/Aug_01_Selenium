package org.PropertiesEX;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiTimeLoginEx1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./src/test/resource/Config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			String browserName = prop.getProperty("bName");
			String url = prop.getProperty("URL");
			String userName = prop.getProperty("uName");
			String password = prop.getProperty("pwd");
			
			GenericUtility gu = new GenericUtility();
			WebDriver driver = gu.startup(browserName);
			driver.get(url);
			
			//Login code
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
			driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys(password);
			driver.findElement(By.cssSelector("#loginButton>div")).click();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
