package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.amazon.utilities.TestUtils;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase()
	{
	    try {
	        prop=new Properties();
	        FileInputStream ip=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\AmazonBddDemo\\src\\main\\java\\com\\amazon\\properties\\config.properties");
	        prop.load(ip);
	        }
	    
	    catch (FileNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	}
	    
	    public static void initialization()
	    {
	        String browserName=prop.getProperty("browser");
	        if(browserName.equals("chrome"))
	        {
	            System.setProperty("webdriver.chrome.driver", "C:\\ChromeBrowserr\\chromedriver.exe");
	             driver =new  ChromeDriver();    
	        }
////	        driver.get(prop.getProperty("url"));
//	        
//	        driver.manage().window().maximize();
//	        driver.manage().deleteAllCookies();
//	        driver.manage().timeouts().pageLoadTimeout(com.amazon.utilities.TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//	        driver.manage().timeouts().implicitlyWait(com.amazon.utilities.TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
//	        
	    }
	     public static void setUp() {
	    	 driver.get(prop.getProperty("url"));
		        
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        driver.manage().timeouts().pageLoadTimeout(com.amazon.utilities.TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		        driver.manage().timeouts().implicitlyWait(com.amazon.utilities.TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		        
	     }
	    public static void setUpGmailUrl() {
	    	 driver.get(prop.getProperty("gmailUrl"));
		        
	    }
//	    public void Close() {
//	        driver.quit();
//	    }


}