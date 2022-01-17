//package
package com.amazon.pageobject;

//imports
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.utilities.TestBase;
import com.amazon.utilities.TestUtils;

//class
public class AddToCartPage extends TestBase {
		
	//Page Factory - Object Repository
	
			@FindBy(xpath="//span[text()='Hello, Sign in']")
			WebElement myAcc;

			@FindBy(xpath="//span[text()='Sign in']")
			WebElement SignInClick;
			
			@FindBy(xpath="//input[@id='ap_email']")
			WebElement eId;
			
			@FindBy(xpath="//input[@id='ap_password']")
			WebElement pwd;
			
			@FindBy(xpath="//input[@id='signInSubmit']")
			WebElement signInBtn;
			
			@FindBy(xpath="//input[@id='continue']")
			WebElement continueBtn;
			
			
			@FindBy(xpath="//input[@id='twotabsearchtextbox']")
			WebElement allClick;
			
			@FindBy(xpath="//span[text()='Einstein Box Gift Set for Babies, Newborns and Infants of Age 1-3-6-9-12 Months | High Contrast Gift Set with Set of Rattles+ High Contrast Books+ High Contrast Flashcards| for Baby Boys & Girls']")
			WebElement selectToy;
			
			@FindBy(xpath="//button[@type='button']")
			WebElement mouseOverOnItem;
			
			@FindBy(xpath="//input[@name='submit.add-to-cart']")
			WebElement addToCart;
			
			////span[text()='Hello, Sign in']
			@FindBy(xpath="//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
			WebElement successMsg;
			
//		//Parameterised Constructor
	
		public AddToCartPage() {
			PageFactory.initElements(driver, this);
			}
	
		public void SignUpClick() {  // SignIn Click Action

			//Mouseover action		
			Actions act = new Actions(driver);
			act.moveToElement(myAcc).build().perform();

		    SignInClick.click();
			
			}
		 
		 public void enterUsernameAndPassword(String username,  String password ) throws InterruptedException
		    {
			 eId.sendKeys(username); 
			 System.out.println(username+"Hello");
			 continueBtn.click();
			 Thread.sleep(2000);
			 pwd.sendKeys(password); 
		    }
		 
		   public void clickSignInBtn() {  //loginbutton click action
		    	//WebElement signInBtn=driver.findElement(By.xpath("//input[@id='signInSubmit']")); // passing xpath through findElement method
		    	signInBtn.click();
		    	
		    }
		   
		   public void mouseOverBabiesAndKidsAndChooseRemoteControlToys() { 
			   
			 //  Baby & Toddler Toys
			   allClick.sendKeys("Baby Toys For Boys");
			   allClick.sendKeys(Keys.ENTER);
				 
		   }
		   
		   public void addItemToCart() {    //addTocart action
			   selectToy.click();
			   
			 String winHandleBefore = driver.getWindowHandle();

			// Perform the click operation that opens new window

			// Switch to new window opened
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}
			addToCart.click();
			 
          Assert.assertTrue(successMsg.isDisplayed());
	     System.out.println(successMsg.isDisplayed());
	     
	    			   			   
		   }
}
