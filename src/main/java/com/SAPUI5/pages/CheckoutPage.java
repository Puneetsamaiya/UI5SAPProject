package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class CheckoutPage extends TestBase{

	@FindBy(id = "container-cart---checkoutView--wizardContentPage-title-inner")
	public WebElement checkoutText;
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
