package org.BasicProgram2;


import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;

public class Ex1 extends GenericUtility {
		
			public static void main(String[] args) {
				String bName = "Chrome";
				GenericUtility gu = new GenericUtility();
				WebDriver driver = gu.startup(bName);
				
				driver.get("http://www.google.com");
				//System.out.println(driver.getTitle());
				String actTitle = driver.getTitle();
				String expTitle = "Google";
				if(actTitle.equals(expTitle)) {
					System.out.println("Title is as expected");
				}else {
					System.out.println("Title is not as expected");
				}
				System.out.println(driver.getCurrentUrl());
	}
			

}
