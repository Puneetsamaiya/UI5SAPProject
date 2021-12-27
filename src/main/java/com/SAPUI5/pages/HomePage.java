package com.SAPUI5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class HomePage extends TestBase{

	
	@FindBy (css = "#__link5-inner")
	WebElement shoppingCartLink;
	
	@FindBy (id = "__button6-BDI-content")
	WebElement acceptAll_button;
	
	//Initializing the page objects
	public HomePage() {
		
		PageFactory.initElements(driver, this);  // driver is coming from Base class
	}
	
	//Actions
	public String validateDemoAppsHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnPopUp() {
		acceptAll_button.click();
	}
	
	public void clickOnShoppingCartLink() {
		shoppingCartLink.click();
	}
}
