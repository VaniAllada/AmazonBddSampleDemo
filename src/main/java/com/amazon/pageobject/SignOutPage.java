package com.amazon.pageobject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utilities.TestBase;

public class SignOutPage extends TestBase {
	
	//Page Factory - Object Repository
		
	@FindBy(xpath="//span[text()='Hello, Vani']")
	WebElement navigateTomyAcc;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	WebElement SignOutClick;
	
	@FindBy(xpath="//*[@id='authportal-main-section']/div[2]/div/div[1]/form/div/div/div/h1")
	WebElement SignOutSuccess;
	  	
	//Parameterised Constructor
	public SignOutPage() {

		PageFactory.initElements(driver, this);
	} 
	   
	//place cursor event
	public void placeCursorOnWrenchClick() {
		
		//mouse over event
		Actions act = new Actions(driver);
		act.moveToElement(navigateTomyAcc).build().perform();
//		navigateTomyAcc.click();
	}
	
	//Logout Functionality
	public void logOut() {

		SignOutClick.click();
		 Assert.assertTrue(SignOutSuccess.isDisplayed());
		 System.out.println(SignOutSuccess.isDisplayed());
		
		
	}

}
