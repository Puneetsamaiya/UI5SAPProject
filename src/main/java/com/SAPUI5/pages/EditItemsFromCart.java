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
	
	
	@FindBy(xpath="//span[text()='Designer Mousepad' and contains(@id, 'cartView')]//following::button[@title='Delete']")
	public WebElement deleteMousePadItem;
	
	@FindBy(xpath= "//bdi[text()='Delete']")
	public WebElement confirmationPopUpDeleteButton;
	
	@FindBy(xpath = "//div[contains(text(),'removed from cart')]")
	public WebElement msgForRemoveItem;
	
	public EditItemsFromCart() {
		PageFactory.initElements(driver, this);
	}
	
	
}
