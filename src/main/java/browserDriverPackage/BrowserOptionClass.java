package browserDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOptionClass {

	public  WebDriver driver;
	 ChromeOptions chromeOptions = new ChromeOptions();
	String browser;

	public  WebDriver init_Driver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			
		}
		return driver;
	}
}
