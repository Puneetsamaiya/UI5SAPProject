package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class OrderSummary extends TestBase{

	//OrderSummary
		@FindBy(xpath = "//bdi[text()='Submit']")
		public WebElement submitButton;
		
		@FindBy(xpath = "//bdi[text()='Yes']")
		public WebElement confirmationCheckoutYesButton;

		public OrderSummary() {
			PageFactory.initElements(driver, this);
		}
		
		
		
	
}
