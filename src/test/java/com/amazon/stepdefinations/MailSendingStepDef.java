package com.amazon.stepdefinations;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobject.AddToCartPage;
import com.amazon.pageobject.MailSendingPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.DriverFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MailSendingStepDef {

	//Variable Declartion
		private DriverFactory driverFactory;
		private WebDriver driver;
		private ConfigReader configReader;
		Properties prop;
		MailSendingPage mailSending;
		
	
	@Given("^Open chromebrowser and navigate to gmail$")
	public void open_chromebrowser_and_navigate_to_gmail() throws Throwable {
	 
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		driverFactory = new DriverFactory();
		driverFactory.getDriver().get(prop.getProperty("gmailUrl"));
			
	}

	@When("^Enter a valid Email Id or Phone Number and Click Next button$")
	public void enter_a_valid_Email_Id_or_Phone_Number_and_Click_Next_button() throws Throwable {
		mailSending = new MailSendingPage(DriverFactory.getDriver());
		mailSending.enterValidEmailAndClickNext();
	}

	@And("^Enter Password and click Sign in button and verify gmail loggedin successfully$")
	public void enter_Password_and_click_Sign_in_button_and_verify_gmail_loggedin_successfully() throws Throwable {
	//	mailSending.enterPasswordAndClickSignIn();
	}

	@And("^Click compose button and verify that a new mail window is opened\\.$")
	public void click_compose_button_and_verify_that_a_new_mail_window_is_opened() throws Throwable {
		//mailSending.clickComposeAndVerifyNewWindowOpenedOrNot();
	}

	@And("^Enter Email Id say |saurabh@qatechhub\\.com|$")
	public void enter_Email_Id_say_saurabh_qatechhub_com() throws Throwable {
		//mailSending.enterEmailId();
	}

	@And("^Enter some subject say |Test Mail|$")
	public void enter_some_subject_say_Test_Mail() throws Throwable {
		//mailSending.enterSubject();
	}

	@Then("^Enter some text in body and Click send button\\.$")
	public void enter_some_text_in_body_and_Click_send_button() throws Throwable {
		//mailSending.clickSendButton();
	}
}
