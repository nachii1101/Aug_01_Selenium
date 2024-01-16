package org.BasicProgram1;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;

public class Ex5 {

	public static void main(String[] args) {
		String bName = "Chrome";
		GenericUtility gu = new GenericUtility();
		WebDriver driver =gu.startup(bName);
		
				
	}

}
