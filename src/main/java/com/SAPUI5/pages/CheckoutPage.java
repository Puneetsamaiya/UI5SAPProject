package com.SAPUI5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class CheckoutPage extends TestBase{

	@FindBy(id = "container-cart---checkoutView--wizardContentPage-title-inner")
	public WebElement checkoutText;
	
	@FindBy(xpath = "//bdi[text()='Step 2']")
	public WebElement step2Button;
	
	@FindBy(xpath = "//h3[text()='Payment Type']")
	public WebElement paymentTypeText;
	
	@FindBy(xpath = "//div[text()='Bank Transfer']")
	public WebElement bankTransferButton;
	
	@FindBy(xpath = "//bdi[text()='Step 3']")
	public WebElement step3Button;

	@FindBy(xpath = "//bdi[text()='Step 4']")
	public WebElement step4Button;
	
	@FindBy(xpath = "//bdi[contains(text(), 'Address for Delivery')]")
	public WebElement textForDelivery;
	
	@FindBy(xpath = "//input[@id = 'container-cart---checkoutView--invoiceAddressAddress-inner']")
	public WebElement invoiceAddress;
	
	@FindBy(xpath = "//input[@id='container-cart---checkoutView--invoiceAddressCity-inner']")
	public WebElement invoiceCity;
	
	@FindBy(xpath = "//input[@id='container-cart---checkoutView--invoiceAddressZip-inner']")
	public WebElement invoiceZip;
	
	@FindBy(xpath = "//input[@id='container-cart---checkoutView--invoiceAddressCountry-inner']")
	public WebElement invoiceCountry;
	
	@FindBy(xpath = "//textarea[@id='__area0-inner']")
	public WebElement invoiceNotes;
	
	@FindBy(xpath = "//bdi[text()='Step 5']")
	public WebElement step5Button;
	
	@FindBy(xpath = "//div[text()='Express']")
	public WebElement expressButton;
	
	
	@FindBy(xpath = "//bdi[text()='Order Summary']")
	public WebElement orderSummaryButton;
	

	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
