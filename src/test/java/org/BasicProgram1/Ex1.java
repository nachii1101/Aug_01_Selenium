package org.BasicProgram1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		String bName = "Chrome";
		if(bName.equalsIgnoreCase("Chrome")||
				bName.equalsIgnoreCase("ch"))
		{
			ChromeDriver objCH = new ChromeDriver();
			objCH.manage().window().maximize();
			
		}
		else {
			System.out.println("Invalid browser");
		}
		//EdgeDriver obj1=new EdgeDriver();

	}

}
