package com.SAPUI5.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SAPUI5.base.TestBase;

public class CategoriesPage extends TestBase{

		
	@FindBy(xpath="//div[contains(text(),'Graphics Card')]")
	public WebElement GraphicsCardItems;
	
	@FindBy(xpath ="//div[contains(text(),'Telecommunication')]")
	WebElement TelecommunicationItems;
	
	@FindBy(xpath ="//div[contains(text(),'Keyboards')]")
	WebElement KeyboardsItems;
	
	@FindBy(xpath = "//div[contains(text(),'Keyboards')]/following::div[@id='__item1-container-cart---homeView--categoryList-6-counter']")
	WebElement KeyboardsItemsCount;
	
	@FindBy(xpath ="//div[contains(text(),'Laptops')]")
	WebElement LaptopsItems;
	
	@FindBy(xpath = "//div[contains(@id, '-counter')]")
	List<WebElement> sizeOfItemCounters;
	
	@FindBy(xpath = "//div[@class='sapMSLITitleOnly']")
	List<WebElement> sizeOfItemTitle;
	
	@FindBy(xpath = "//li[contains(@id, '__item5-container-cart---category--productList-')]")
	List<WebElement> listOfEachIteam;
	
	@FindBy(id ="container-cart---category--page-navButton")
	public WebElement backButton;
	
	@FindBy(xpath = "//div[text()='Mice']")
	public WebElement miceItemElement;

	@FindBy(xpath = "//div[text()='Telecommunication']")
	public WebElement telecommunicationElement;
	
	
	@FindBy(xpath = "//span[text()= 'Wireless DSL Router / Repeater' and @id ='__item5-container-cart---category--productList-1-titleText-inner']")
	public WebElement TelecomProductWirelessDSLRouter;
	
	@FindBy(id ="__button10-BDI-content")
	public WebElement addToCartButton;
	
	@FindBy(xpath ="//div[contains(text(), 'added to your')]")
	public WebElement msg;
	
	@FindBy(id="__button9-img")
	public WebElement CartIcon;
	
	@FindBy(id = "container-cart---cartView--proceedButton-BDI-content")
	public WebElement Proceed;
	
	public CategoriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	public int countTotalNoOfCategoryItems() {
		return sizeOfItemCounters.size();
		
	}
	public void countNoOfCategoryItems() {
		System.out.println(KeyboardsItemsCount.getText());
	}
	public String toPrintEachItemTitle(int i) {
		return sizeOfItemTitle.get(i).getText();
	}
	public String toPrintEachItemTitleCount(int i) {
		return sizeOfItemCounters.get(i).getText();
	}
	
	public int validateEachItemList() {
		return listOfEachIteam.size();
	}
	

	public void clickOnBackButton() {
		backButton.click();
	}
	
	public void clickOnCategoryItem(WebElement we) {
		we.click();
	}
	
}
