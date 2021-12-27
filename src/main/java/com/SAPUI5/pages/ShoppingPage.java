package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class ShoppingPage extends TestBase {

	public String expectedTitle = "Shopping Cart"; 
//	@FindBy (id = "__button6-BDI-content")
//	WebElement acceptAll_button1;
	  
	@FindBy (xpath = "//span[@id='__title0-inner']")
	public
	WebElement welcomeText;
	

	public ShoppingPage() {
		
		PageFactory.initElements(driver, this);  // driver is coming from Base class
	}
	
	
	public boolean verifyWelcomeText() {
		return welcomeText.isDisplayed();
	}
	
	
}
