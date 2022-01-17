package com.amazon.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobject.AddToCartPage;

import com.amazon.pageobject.SignOutPage;
import com.amazon.utilities.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignOutStepDef extends TestBase{

	//Variable Declartion
	SignOutPage signout;
	TestBase testBase;
	
// Gerkin keywords 
//		//Actions mapping through snippets

	@When("^place the cursor on wrenchs icon and click$")
	public void place_the_cursor_on_wrenchs_icon_and_click() throws Throwable {
		signout = new SignOutPage();	
		signout.placeCursorOnWrenchClick();
	}

	@Then("^Moves the mouse hover on Logout$")
	public void moves_the_mouse_hover_on_Logout() throws Throwable {
		
	   signout.logOut();
	}


}
