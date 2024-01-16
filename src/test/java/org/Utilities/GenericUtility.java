package org.Utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class GenericUtility {
	private static final String Expression = null;

	//****************Action Class Methods******************//
	public void ClickByActions(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}
	
	public void sendkeysByActions(WebDriver driver,WebElement ele,String text) {
		Actions act = new Actions(driver);
		act.sendKeys(ele,text).perform();
	}
	
	public void scrollByActions(WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
		}
		
		public void contextClickByActions(WebDriver driver,WebElement ele) {
			Actions act = new Actions(driver);
			act.contextClick(ele).perform();
		}
		
			public void doubleClickByActions(WebDriver driver,WebElement ele) {
				Actions act = new Actions(driver);
				act.doubleClick(ele).perform();
			}
			//************************Frames Methods***********************//
			public void switchToFrameByEle(WebDriver driver,int time,WebElement ele) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
			}
			
			public void switchToFrameByEle(WebDriver driver,int time,int Index) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Index));
			}
			public void switchToFrameByEle(WebDriver driver,int time,String type,String expression) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
				if(type.equalsIgnoreCase("cssSelector")) {
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.cssSelector(expression))));
				}else if(type.equalsIgnoreCase("xpath")){
					wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath(expression))));
			}else if(type.equalsIgnoreCase("id")){
				wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.id(expression))));
		}else if(type.equalsIgnoreCase("className")){
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className(expression))));
	}else if(type.equalsIgnoreCase("tagName")){
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.tagName(expression))));
}else if(type.equalsIgnoreCase("name")){
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.name(expression))));
}else if(type.equalsIgnoreCase("linkText")){
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.linkText(expression))));
}else if(type.equalsIgnoreCase("partialLinkTest")){
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.partialLinkText(expression))));
}else {
	System.out.println("Invalid Locator type");
	}
}
			//************Select class Methods******************//
			public void selectByText(WebElement ddl, String text) {
				Select sel = new Select(ddl);
				sel.selectByVisibleText(text);
			}
			public void selectByValue(WebElement ddl, String value) {
				Select sel = new Select(ddl);
				sel.selectByValue(value);
			}
			public void selectByIndex(WebElement ddl,int index) {
				Select sel = new Select(ddl);
				sel.selectByIndex(index);
			}
			public int getNumberOfOptions(WebElement ddl) {
				Select sel = new Select(ddl);
				return sel.getOptions().size();
			}
			public void selectAllOptions(WebElement ddl) {
				Select sel = new Select(ddl);
				for(int i=0;i<sel.getOptions().size();i++) {
					sel.selectByIndex(i);
				}
			}
			public String getSelectedTextFromDDl(WebElement ddl) {
				Select sel = new Select(ddl);
				return sel.getFirstSelectedOption().getText();
			}
			public ArrayList<String> getAllSelectedTextfromDDl(WebElement ddl){
				Select sel = new Select(ddl);
				List<WebElement> allSelected = sel.getAllSelectedOptions();
				ArrayList<String> allSelectedText = getTextOfList(allSelected);
				return allSelectedText;
			}
	public ArrayList<String> getTextOfList(List<WebElement> allEles){
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0;i<allEles.size();i++) {
			ar.add(allEles.get(i).getText());
		}
			return ar;
	}
		//*******************************************************************
	public void clickByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", ele);
	}
	public void sendKeysByJS(WebDriver driver,WebElement ele,String text) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = arguments[1]",ele,text);
	}
	public void scrollByJS(WebDriver driver,WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	public void scrollBypageDown(WebDriver driver,int numOfScrolls) {
		WebElement ele = driver.findElement(By.xpath("//html"));
		for(int i=1;i<=numOfScrolls;i++) {
		ele.sendKeys(Keys.PAGE_DOWN);
	}
}
	public void waitForTitleContains(WebDriver driver,int time,String partialTitle ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time)) ;
		wait.until(ExpectedConditions.titleContains(partialTitle));
	}
	public void waitForURlContains(WebDriver driver,int time,String partialURL ) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time)) ;
		wait.until(ExpectedConditions.titleContains(partialURL));	
	}
	public void waitForVisibilityByEle(WebDriver driver,int time,WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForVisibilityByEletype(WebDriver driver,int time,String type,String Expression) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time)) ;
		if(type.equalsIgnoreCase("xpath")) {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(Expression))));
			}else if(type.equalsIgnoreCase("cssSelector")) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(Expression))));
			}else if(type.equalsIgnoreCase("className")) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(Expression))));
			}else if(type.equalsIgnoreCase("id")) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(Expression))));
			}else if(type.equalsIgnoreCase("name")) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(Expression))));
			}else if(type.equalsIgnoreCase("linkText")) {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(Expression))));
			}else {
				System.out.println("Invalid Locator Type");
			}
		}
	//generic method for wait for visibility by
	public void waitForVisibilityBy(WebDriver driver,int time,String type,String Expression) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		if(type.equalsIgnoreCase("cssSelector")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Expression)));
			}else if(type.equalsIgnoreCase("xpath")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Expression)));
			}else if(type.equalsIgnoreCase("id")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Expression)));
			}else if(type.equalsIgnoreCase("className")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(Expression)));
			}else if(type.equalsIgnoreCase("Name")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Expression)));
			}else if(type.equalsIgnoreCase("linkText")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(Expression)));
			}else if(type.equalsIgnoreCase("PartiallinkText")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(Expression)));
			}else {
				System.out.println("Invalid Locator type");
			}
	}
	//generic method for wait invisibility by
	public void waitForInVisibilityBy(WebDriver driver,int time,String type,String Expression) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		if(type.equalsIgnoreCase("cssSelector")) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Expression)));
			}else if(type.equalsIgnoreCase("xpath")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Expression)));
			}else if(type.equalsIgnoreCase("id")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(Expression)));
			}else if(type.equalsIgnoreCase("className")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(Expression)));
			}else if(type.equalsIgnoreCase("Name")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(Expression)));
			}else if(type.equalsIgnoreCase("linkText")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(Expression)));
			}else if(type.equalsIgnoreCase("PartiallinkText")) {
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.partialLinkText(Expression)));
			}else {
				System.out.println("Invalid Locator type");
			}
	}
	//generic method for clickable
	public void waitforclickableBy(WebDriver driver,int time,String type,String Expression) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		if(type.equalsIgnoreCase("cssSelector")) {
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(Expression)));
			}else if(type.equalsIgnoreCase("xpath")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Expression)));
			}else if(type.equalsIgnoreCase("id")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.id(Expression)));
			}else if(type.equalsIgnoreCase("className")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.className(Expression)));
			}else if(type.equalsIgnoreCase("tagName")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.tagName(Expression)));
			}
			else if(type.equalsIgnoreCase("Name")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.name(Expression)));
			}else if(type.equalsIgnoreCase("linkText")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.linkText(Expression)));
			}else if(type.equalsIgnoreCase("PartiallinkText")) {
				wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(Expression)));
			}else {
				System.out.println("Invalid Locator type");
			}
	}
	public WebDriver startup(String bName) {
		WebDriver driver = null;
		if(bName.equalsIgnoreCase("chrome")||
				bName.equalsIgnoreCase("ch")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximize");
			options.addArguments("--disable-notifications");
			//options.addArguments("--headless"); //browser is opened but in background is not able to see
			driver = new ChromeDriver(options);//upcasting
			Reporter.log("Launched Chrome browser.");
		}else if(bName.equalsIgnoreCase("Edge")) {
			
			driver = new EdgeDriver();
		}
		else if(bName.equalsIgnoreCase("Firefox")) {
			
			driver = new FirefoxDriver();
			
	}
		else {
			System.out.println("Invalid browser name");
			}
		return driver;
		}

	
		
	
	
}
	

		
