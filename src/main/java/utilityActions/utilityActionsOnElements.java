package utilityActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserDriverPackage.BrowserOptionClass;

public class utilityActionsOnElements {

	BrowserOptionClass browserOption = new BrowserOptionClass();
	
	public WebDriver driver = browserOption.init_Driver("chrome");
	
	public void doClick(By findBy) {
		
		driver.findElement(findBy).click();
	}
	
	public void doSendKeys(By findBy, String text) {
		driver.findElement(findBy).sendKeys(text);
	}
	
	public void goToURL() {
		driver.get("https://sapui5.hana.ondemand.com/#/demoapps");
	}
	
	public void waitForElementToBeClickable(By findBy) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(findBy));
	}
	

	public void quitBrowser()  throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
