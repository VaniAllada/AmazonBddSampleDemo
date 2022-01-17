package com.amazon.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.pageobject.SortingPage;
import com.amazon.utilities.ConfigReader;

import com.amazon.utilities.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MensShirtSorting extends TestBase{
		
	//Variable Declaration
		
		SortingPage sortingPage;
		TestBase testBase;
		
	// Click on mens T-shirt action	
	@When("^Click on the Men's T-shirt$")
	public void click_on_the_Men_s_T_shirt() throws Throwable {

		sortingPage =new SortingPage();	
		sortingPage.menuAllCatagories();
	
	}

	@Then("^Click on any checkbox under brand and Observe the chosen option displayed$")
	public void click_on_any_checkbox_under_brand_and_Observe_the_chosen_option_displayed() throws Throwable {
		sortingPage.brandSelectionObservation();
		
	}

}
