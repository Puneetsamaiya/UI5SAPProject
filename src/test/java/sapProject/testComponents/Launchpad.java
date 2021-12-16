package sapProject.testComponents;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilityActions.utilityActionsOnElements;

public class Launchpad {

	HomePage basePage = new HomePage();
	utilityActionsOnElements utilObjects = new utilityActionsOnElements();
	
	@BeforeTest
	public void setup() {
		utilObjects.goToURL();
	}
	
		
	@Test
	public void launchTest(){
		
		utilObjects.waitForElementToBeClickable(basePage.acceptAll_button);
		utilObjects.doClick(basePage.acceptAll_button);
		utilObjects.waitForElementToBeClickable(basePage.shoppingCartLink);
		utilObjects.doClick(basePage.shoppingCartLink);
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		utilObjects.quitBrowser();
	}
}
