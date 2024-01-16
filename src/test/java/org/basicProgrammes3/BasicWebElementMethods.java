package org.basicProgrammes3;

import java.nio.file.spi.FileSystemProvider;

import org.Utilities.GenericUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicWebElementMethods {

	public static void main(String[] args) {
		System.out.println("***Program Starts***"); 
		String bName="Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver = gu.startup(bName);
		driver.get("https://demoqa.com/radio-button");
		
		WebElement yesLabel = driver.findElement( By.cssSelector("label[for='yesRadio']"));
		System.out.println("isDisplayed : "+yesLabel.isDisplayed());
		
		WebElement yesRdoBtn = driver.findElement(By.id("yesRadio"));
		System.out.println("isSelected : "+yesRdoBtn.isDisplayed());
	//yesRdoBtn.click();
		gu.clickByJS(driver,yesRdoBtn);
		System.out.println("isSelected : "+yesRdoBtn.isSelected());
		
		WebElement noRdoBtn = driver.findElement(By.id("noRadio"));
		System.out.println("isEnabled : "+noRdoBtn.isEnabled());
		System.out.println("***Program Ends***");
	}

}
