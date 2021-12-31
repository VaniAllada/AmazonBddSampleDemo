package com.amazon.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobject.AddToCartPage;
import com.amazon.pageobject.LogoutPage;
import com.amazon.pageobject.SortingPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.DriverFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef {

	//Variable Declartion
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	LogoutPage logout;
	
	
	@When("^Place the cursor on wrench icon and click$")
	public void place_the_cursor_on_wrench_icon_and_click() throws Throwable {
		logout = new LogoutPage(DriverFactory.getDriver());
		logout.placeCursorOnWrenchClick();
	}

	@Then("^Move the mouse hover on Logout$")
	public void move_the_mouse_hover_on_Logout() throws Throwable {
		logout.logOut(); 
	}
}
