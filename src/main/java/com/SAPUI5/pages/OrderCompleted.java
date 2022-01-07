package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class OrderCompleted extends TestBase{

	//OrderCompleted
	@FindBy(xpath = "//h3[contains(text(), 'Thank you for your order!')]")
	public WebElement textForThankyouOrder;
	
	public OrderCompleted() {
		PageFactory.initElements(driver, this);
	}
}
