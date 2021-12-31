//package
package com.amazon.utilities;

// imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//class
public class DriverFactory {
	
	   //Variable Declaration
		public WebDriver driver;
		public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
		
		public WebDriver init_driver(String browser) {
			System.out.println("browser is: " +browser);
			
			if(browser.equalsIgnoreCase("chrome")) {  // if condition for checking which browser is launching
				WebDriverManager.chromedriver().setup();   // setting up webdriver
			tlDriver.set(new ChromeDriver());
				
//				if(browser.equalsIgnoreCase("firefox")) {
//					WebDriverManager.firefoxdriver().setup();	
//					tlDriver.set(new FirefoxDriver());
			}
			else { // else block
				System.out.println("please pass the correct browser");
			}
			
			getDriver().manage().deleteAllCookies();  // delete cookies
			getDriver().manage().window().maximize();  // maximise window
			
			return getDriver();  // returning driver instance
		}
		public String getApplicationUrl(String url) {   // get application url
			return url;
		}
		
		public static WebDriver getDriver() {  // get driver instance
			return tlDriver.get(); 
		}
		

}
