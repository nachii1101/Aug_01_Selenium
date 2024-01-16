package org.BasicProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {

	public static void main(String[] args) {
		WebDriver driver = null;
		String bName = "Chrome";
		if(bName.equalsIgnoreCase("chrome")||
				bName.equalsIgnoreCase("ch"))
		{
			//ChromeDriver objCH = new ChromeDriver();
			//objCH.manage.window.maximize();
			//OR
			//WebDriver driver = new ChromeDriver();
			//OR
			driver=new ChromeDriver();
		}
			else if(bName.equalsIgnoreCase("Edge"))
			{//EdgeDriver obj1 = new EdgeDriver();
				////obj1.manage.window.maximize();
				//OR
				//WebDriver driver = new EdgeDriver();
				//OR
				driver = new EdgeDriver();
			}
			else if(bName.equalsIgnoreCase("Firefox"))
			{
				//FirefoxDriver obj2 = new FirefoxDriver();
				////obj2.manage.window.maximize();
				//OR
				//WebDriver driver = new FirefoxDriver();
				//OR
				driver = new FirefoxDriver();
	}
	else {
		System.out.println("Invalid browser name");
	}

	}	
}		
		
	
	
	
	


