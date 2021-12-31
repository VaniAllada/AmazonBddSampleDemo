//Package
package com.amazon.pageobject;

//Imports
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//Class
public class MailSendingPage {

	        //Variable Declaration
			private WebDriver driver;
			
			//Parameterised Constructor
			public MailSendingPage(WebDriver driver) {
				this.driver = driver;
			}
			
			public void enterValidEmailAndClickNext() {  // Email Entering code 

				WebElement emailId = driver.findElement(By.xpath("//input[@type='email']"));
				emailId.sendKeys("vanidasari.ios3607@gmail.com");
				emailId.sendKeys(Keys.ENTER);
				
				//mouse over event for next button
				WebElement nextBtnClick = driver.findElement(By.xpath("//span[text()='Next']"));
				Actions act = new Actions(driver);
				act.moveToElement(nextBtnClick).perform();
				//nextBtnClick.click();
			
			}
			
			//User going to the enter password and click the signin button
			public void enterPasswordAndClickSignIn() {
				
				WebElement pwdNavigate = driver.findElement(By.xpath("//div[@class='vxx8jf']"));
				Actions act = new Actions(driver);
				act.moveToElement(pwdNavigate).perform();
				
				//Finding an xpath for an element
				WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
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
