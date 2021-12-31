package com.amazon.stepdefinations;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobject.AddToCartPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.DriverFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDef extends DriverFactory{
	
	//Variable Declaration
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	AddToCartPage addToCart;
	
	// Gerkin keywords 
	//Actions mapping through snippets
	@Given("^Open chromebrowser and type amazon url$")
	public void open_chromebrowser_and_type_amazon_url() throws Throwable {
	
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		driverFactory = new DriverFactory();
		driverFactory.getDriver().get(prop.getProperty("url"));
	}

	@Then("^User clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
		
		addToCart = new AddToCartPage(DriverFactory.getDriver());
		addToCart.SignInClick();
	}

	@When("^User is going to enter below username$")
	public void user_is_going_to_enter_below_username(DataTable arg1) throws Throwable {
		List<String>username=arg1.asList(String.class);
		addToCart = new AddToCartPage(DriverFactory.getDriver());
		addToCart.enterUsername(username.get(0));
	
	}

	@Then("^User should click on next button$")
	public void user_should_click_on_next_button() throws Throwable {
		addToCart.clickContinueButton();
	}

	@When("^User is going to enter below password and click on submit button$")
	public void user_is_going_to_enter_below_password_and_click_on_submit_button(DataTable arg1) throws Throwable {
		List<String>password=arg1.asList(String.class);
		addToCart = new AddToCartPage(DriverFactory.getDriver());
		addToCart.enterPassword(password.get(0));
		addToCart.clickSignInBtn();
	
	}


 @And("^Mouse over on Babies and kids and click on Remote-control toys$")
public void mouse_over_on_Babies_and_kids_and_click_on_Remote_control_toys() throws Throwable {
	 addToCart.mouseOverBabiesAndKidsAndChooseRemoteControlToys();
}

	@Then("^Select any toy and click on add to cart$")
	public void select_any_toy_and_click_on_add_to_cart() throws Throwable {
		addToCart.addItemToCart();
	}
	
	

}
