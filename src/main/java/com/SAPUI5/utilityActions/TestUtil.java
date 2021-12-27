package com.SAPUI5.utilityActions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SAPUI5.base.TestBase;

public class TestUtil extends TestBase{

	
	
	//TestBase browserOption = new TestBase();
	
	//public WebDriver driver = browserOption.init_Driver("chrome");
	
	/*
	 * public void doClick(By findBy) {
	 * 
	 * driver.findElement(findBy).click(); }
	 */
	
	/*
	 * public void doSendKeys(By findBy, String text) {
	 * driver.findElement(findBy).sendKeys(text); }
	 */
	/*
	 * public void goToURL() {
	 * driver.get("https://sapui5.hana.ondemand.com/#/demoapps"); }
	 */
	
	public void waitForElementToBeClickable(WebElement acceptAll_button) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(acceptAll_button));
	}
	
	/*
	 * public String getTitleOfThePage() { return driver.getTitle(); }
	 */
	public void waitForElementToBeVisible(WebElement WelcomeText) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(WelcomeText));
	//wait.until(ExpectedConditions.visibilityOf(WelcomeText));
	
	}
	public void switchToChildWindowShoppingPage() throws InterruptedException {
		//String mainwindowhandle = driver.getWindowHandle();
		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		itr.next();
		String cw=itr.next();
		//Thread.sleep(5000);
		driver.switchTo().window(cw);
		//Thread.sleep(5000);
		//System.out.println(cw);
		
	}

}
