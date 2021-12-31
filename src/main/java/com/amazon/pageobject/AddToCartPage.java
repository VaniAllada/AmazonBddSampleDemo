//package
package com.amazon.pageobject;

//imports
import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.amazon.utilities.DriverFactory;
import com.amazon.utilities.TestUtils;

//class
public class AddToCartPage extends DriverFactory {
		
		//Variable Declaration
		private WebDriver driver;
		
		//Parameterised Constructor
		public AddToCartPage(WebDriver driver) {
			this.driver = driver;
		}
		
		public void SignInClick() {  // SignIn Click Action

			WebElement myAcc=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
			
			//Mouseover action
			Actions act = new Actions(driver);
			act.moveToElement(myAcc).perform();

			
			WebElement SignInClick=driver.findElement(By.xpath("//span[text()='Sign in']"));	
			SignInClick.click();  // Click Event
			
			}
		
		//User going to enter username
		 public void enterUsername(String username) {   //enter email action
		    	WebElement eId=driver.findElement(By.xpath("//input[@id='ap_email']"));
		    	eId.sendKeys(username);  
		    }
		 
		 //Click Continue action
		 public void clickContinueButton() {   
			 WebElement continueBtn=driver.findElement(By.xpath("//input[@id='continue']"));
			 continueBtn.click();			 
		 }
		 
		 //User going to enter password
		 public void enterPassword(String password) {
		    	WebElement pwd=driver.findElement(By.xpath("//input[@id='ap_password']"));
		    	pwd.sendKeys(password); // entering password through send keys method
		   }
		 
		 
		   public void clickSignInBtn() {  //loginbutton click action
		    	WebElement signInBtn=driver.findElement(By.xpath("//input[@id='signInSubmit']")); // passing xpath through findElement method
		    	signInBtn.click();
		    	
		    }
		   
		   public void mouseOverBabiesAndKidsAndChooseRemoteControlToys() { 
			   
			 //  Baby & Toddler Toys
			   WebElement allClick=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			   allClick.sendKeys("Baby Toys For Boys");
			   allClick.sendKeys(Keys.ENTER);
				 
		   }
		   
		   public void addItemToCart() {    //addTocart action
			   
			   WebElement selectToy = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
			   selectToy.click();
			
			   Actions act = new Actions(driver);
				
			   WebElement mouseOverOnItem=driver.findElement(By.xpath("//button[@type='button']"));
			   act.moveToElement(mouseOverOnItem).perform();
			   
			   Actions act1 = new Actions(driver);
				
			   WebElement addToCart=driver.findElement(By.xpath("//*[@id='add-to-cart-button']"));
			   act1.moveToElement(addToCart).perform();
               addToCart.click();
			   			   
		   }
}
