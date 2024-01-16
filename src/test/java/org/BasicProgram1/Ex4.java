package org.BasicProgram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex4 {

	public static void main(String[] args) {	//writing the opening browser code in separate method
		String bName = "Chrome";
		Ex4 obj = new Ex4();
		obj.startup(bName);
		}

	private void startup(String bName) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("Chrome")||
				bName.equalsIgnoreCase("ch")) {
			driver = new ChromeDriver();
			
		}else if(bName.equalsIgnoreCase("Edge")){
			driver = new EdgeDriver();
		}else if(bName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}  
		else {
			System.out.println("Invalid browser name");
		}
				
		

	
	}	
}
		
	
	
	
	


