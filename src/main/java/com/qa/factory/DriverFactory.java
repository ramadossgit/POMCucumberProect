package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	/*
	 * This method is used to initialize the thread local driver on the basis of grid execution
	 * @param browser
	 * @return this will return tldriver
	 */
	
	public WebDriver init_driver(String browser) {
		System.out.println("Browser value is: " + browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new FirefoxDriver());
		}else {
			System.out.println("Please pass the correct browser value: "+ browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*
	 * this is used to get the driver with ThreadLocal
	 * @return
	 */
			
	public static synchronized WebDriver getDriver() {
		
		return tlDriver.get();

	}

}
