package org.fileUpload;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendKeysEx {

	public static void main(String[] args) {
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://demoqa.com/automation-practice-form");
		gu.scrollBypageDown(driver, 1);
		WebElement uploadBtn =driver.findElement(By.id("uploadPicture"));
		String filename = System.getProperty("user.dir") +"\\src\\test\\resource\\org\\fileUpload\\TestUpload.txt";
		uploadBtn.sendKeys(filename);

	}
}
