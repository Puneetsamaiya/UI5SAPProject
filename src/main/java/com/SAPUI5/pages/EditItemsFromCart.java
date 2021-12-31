package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class EditItemsFromCart extends TestBase{

	@FindBy(id = "container-cart---cartView--editButton-img")
	public WebElement editButton;
	
	@FindBy(id = "container-cart---cartView--doneButton")
	public WebElement saveChangesButton;
	
	public EditItemsFromCart() {
		PageFactory.initElements(driver, this);
	}
	
	
}
