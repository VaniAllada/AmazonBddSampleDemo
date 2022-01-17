//Package
package com.amazon.pageobject;

//Imports
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utilities.TestBase;

//Class
public class MailSendingPage extends TestBase{

			
			//Parameterised Constructor
			public MailSendingPage() {
				PageFactory.initElements(driver, this);
			}
			
			//Page Factory - Object Repository			
			@FindBy(xpath="//*[@id='identifierId']")
			WebElement emailId;
			
			@FindBy(xpath="//span[text()='Next']")
			WebElement nextBtnClick;
			
			@FindBy(xpath="//div[@class='vxx8jf']")
			WebElement pwdNavigate;
			
			@FindBy(xpath="//input[@type='password']")
			WebElement password;
			
//			@FindBy(xpath="//div[@class='vxx8jf']")
//			WebElement pwdNavigate;
//			
//			@FindBy(xpath="//div[@class='vxx8jf']")
//			WebElement pwdNavigate;
//			
			
			public void enterValidEmailAndClickNext() {  // Email Entering code 
				
//				
				emailId.click(); // Keep this click statement even if you are using click before clear.
				emailId.clear();
				emailId.sendKeys("peddineni.chenna@gmail.com");
//				emailId.sendKeys("vanidasari.ios3607@gmail.com");
//				emailId.sendKeys(Keys.ENTER);
				
				//mouse over event for next button		
				Actions act = new Actions(driver);
				act.moveToElement(nextBtnClick).perform();
				nextBtnClick.click();
			
			}
			
			//User going to the enter password and click the signin button
			public void enterPasswordAndClickSignIn() {
				
				Actions act = new Actions(driver);
				act.moveToElement(pwdNavigate).perform();
				
				//Finding an xpath for an element
				password.sendKeys("Amark@3607");  // passing some text using sendkeys method
				password.sendKeys(Keys.ENTER); // Keys.Enter method perform Enter event after entered the text
				
			}
			
			public void clickComposeAndVerifyNewWindowOpenedOrNot() {
				
				
			}
			
			public void enterEmailId() {
				
				
			}
			
			public void enterSubject() {
				
				
			}
			
			public void clickSendButton() {
				
				
			}
			
			
}
