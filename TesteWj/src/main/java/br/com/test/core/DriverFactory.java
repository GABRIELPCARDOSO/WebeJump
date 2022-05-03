package br.com.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.test.config.AppConfig;

public class DriverFactory {

	private static WebDriver driver;
	
	private DriverFactory() {}
	
	@SuppressWarnings("deprecation")
	public static WebDriver getDriver() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver",					
					AppConfig.getConfig().caminhoWebDriver);
			switch (Propriedades.browser) {
			
			case CHROME:
				driver = new ChromeDriver();
				break;
				
			case FIREFOX:
				driver = new FirefoxDriver(); 
				break;
			}
		}
		return driver;
	}
	
	public static void killDriver() {
		if(driver != null) {
		driver.quit();
		driver = null;
		}
	}
}
	
