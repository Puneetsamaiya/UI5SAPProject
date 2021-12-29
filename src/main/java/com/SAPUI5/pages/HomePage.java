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
	
	@FindBy (id = "__icon0")WebElement cartIcon;
	@FindBy(xpath = "//span[contains(text(),'The classic business process of finding and ordering products')]")WebElement classicText;
	
	//Initializing the page objects
	public HomePage() {
		
		PageFactory.initElements(driver, this);  // driver is coming from TBase class
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
	
	public boolean validateCartIconImage() {
		return cartIcon.isDisplayed();
	}
	
	public boolean validateClassicText() {
		return classicText.isDisplayed();
	}
}
