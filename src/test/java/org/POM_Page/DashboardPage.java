package org.POM_Page;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends GenericUtility {
	
private WebDriver driver; 
	//1.WebElements
	
	//2.Constructor
	public void Dashboardpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	//3.Page Action Methods
	public String getDashboardPageTitle() {
		return driver.getTitle();
	}
	public String getDashboardPageURL() {
		return driver.getTitle();
	}
}
