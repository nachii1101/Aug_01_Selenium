package org.POM_Page;

import java.util.List;

import org.Utilities.GenericUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericUtility {
	private WebDriver driver;
	//1.WebElements
	@FindBy(id="username")
	private WebElement userNameField;
	
	@FindBy(css=".textField.pwdfield")
	private WebElement pwdField;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoginChkBox;
	
	@FindBy(css="#loginButton>div")
	private WebElement loginBtn;
	
	@FindBy(css="#logoContainer img")
	private List<WebElement> loginLogos;
	
	@FindBy(id="#logoutLink>div")
	private WebElement logoutLink;
	
	@FindBy(css=".content.selected.tt>div:first-child")
	private WebElement timeTrackTab;
	
	//2.Constructor
	public LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		//or
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		}
	//3.Page Action Methods
			public boolean isUserNameFieldDisplayed() {
				boolean flag = userNameField.isDisplayed();
				return flag;
	}
			public boolean isPasswordFieldDisplayed() {
				return pwdField.isDisplayed();
			}
			public boolean iskeepMeLoginChkBoxDisplayed() {
				return keepMeLoginChkBox.isDisplayed();
			}
			public boolean isloginBtnDisplayed() {
				return loginBtn.isDisplayed();
			}
			public boolean isloginLogosDisplayed() {
				//WebElement ele1=loginLogos.get(0);
				//ele1.isDisplayed();
				for(int i=0;i<2;i++) {
					if(!loginLogos.get(i).isDisplayed()) {
						return false;
					}
				}
				return true;
			}
			public void enterUsername(String uName) {
				userNameField.sendKeys(uName);
			}
			public void enterPassword(String pwd) {
				pwdField.sendKeys(pwd);
			}
			public void clickOnLoginBtn() {
				loginBtn.click();
				waitForVisibilityByEle(driver,10,logoutLink);
			}
			public boolean isTimeTrackTabDisplayed() {
				return timeTrackTab.isDisplayed();
			}
			public String getLoginPageTitle() {
				return driver.getTitle();
			}
			public String getLoginPageURL() {
				return driver.getCurrentUrl();
			}
}

