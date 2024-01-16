package org.BasicProgram1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {

	public static void main(String[] args) {
		WebDriver driver = null;
		String bName = "Chrome";
		if(bName.equalsIgnoreCase("Chrome")||
				bName.equalsIgnoreCase("ch"))
		{
			driver = new ChromeDriver();		//upcasting
		}else if(bName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			
		}else if(bName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("Invalid browser name");
		}
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(300,300));
		

	}	
}		
		
	
	
	
	


