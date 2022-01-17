//package
package com.amazon.pageobject;

//imports
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.amazon.utilities.TestBase;

//class
public class SortingPage extends TestBase {
	
	 //Page Factory - Object Repository
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement menu;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[17]/a")
	WebElement mensFashion;
	
	@FindBy(xpath="//a[text()='T-shirts & Polos']")
	WebElement tShirtsAndPolos;
	
	@FindBy(xpath="//*[@id=\"s-refinements\"]/div[11]/ul/li[4]/span/a/div/label/i")
	WebElement brandSelection;
	
	@FindBy(xpath="//*[@id=\"p_89/LEOTUDE\"]/span/a/span")
	WebElement brandObservation;
	
			//Parameterised Constructor
			public SortingPage() {
				PageFactory.initElements(driver, this);
			}
			
        			
			//Menu Button Action
			public void menuAllCatagories() {  //Click Menu Button Action
				
				//Mouse over event
			Actions act = new Actions(driver);
			act.moveToElement(menu).perform();
			menu.click();
				
			// Sorting 
			mensFashion.click();
			tShirtsAndPolos.click();
		
				}
			
			public void brandSelectionObservation() {
				brandSelection.click();
//				 Assert.assertTrue(brandObservation.isDisplayed());
//			     System.out.println(brandObservation.isDisplayed());
			     
				
			}

}
