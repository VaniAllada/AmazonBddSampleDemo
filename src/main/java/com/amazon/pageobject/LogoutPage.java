//Package
package com.amazon.pageobject;

//All Imports 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amazon.utilities.DriverFactory;

//LogoutPage using inheritence concept using extends keyword from Driver Factory
public class LogoutPage extends DriverFactory {
	
	//Variable Declaration
	private WebDriver driver;
	
	//Parameterised Constructor
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	} 
	
	//place cursor event
	public void placeCursorOnWrenchClick() {
		
		//finding an xpath for web element 
		WebElement myAcc=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		
		//mouse over event
		Actions act = new Actions(driver);
		act.moveToElement(myAcc).perform();
		
	}
	
	//Logout Functionality
	public void logOut() {
		
		//finding an xpath for signout and perform click event for that
		WebElement SignInClick=driver.findElement(By.xpath("//span[text()='Sign Out']"));	
		SignInClick.click();
		
	}

}
