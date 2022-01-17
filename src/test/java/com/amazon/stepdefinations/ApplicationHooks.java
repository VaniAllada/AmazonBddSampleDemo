package com.amazon.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.TestBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ApplicationHooks {


	//Variable Declartion
	
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@After(order = 0)
	public void quitBrowser() {
		//driverFactory.getDriver().close();    // closing bowser
	}
	
	 @After
		public void endTest(Scenario scenario) { // Taking Screenshots for failed testcases
			if (scenario.isFailed()) {

				try {

					final byte[] screenshot = ((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES);
					scenario.embed(screenshot, "image/png"); // ... and embed it in
				} catch (WebDriverException e) {
					e.printStackTrace();
				}

			} else {   // Taking Screenshots for passed testcases
				try {
					scenario.embed(((TakesScreenshot) TestBase.driver).getScreenshotAs(OutputType.BYTES), "image/png");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

//			TestBase.driver.quit();
		}
		
}
