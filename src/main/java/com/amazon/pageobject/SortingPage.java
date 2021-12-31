//package
package com.amazon.pageobject;

//imports
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//class
public class SortingPage {
	
	        //Variable Declaration
			private WebDriver driver;
			
			//Parameterised Constructor
			public SortingPage(WebDriver driver) {
				this.driver = driver;
			}
			
			//Menu Button Action
			public void menuAllCatagories() {  //Click Menu Button Action
				
			//Finding an web element
			WebElement menu=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));	
				
			//Mouse over event
			Actions act = new Actions(driver);
			act.moveToElement(menu).perform();
			menu.click();
				
			// Sorting 
//			WebElement seeAll=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a[1]/div"));	
//			Select dropdown = new Select(seeAll); 
//			dropdown.selectByIndex(3); 
				
			//Scrolling Down Function
			List<WebElement> optionList = driver.findElements(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a[1]/div"));
			// The option you mentioned in your example is stored at position #17 in an array so either you can manually enter the number or you can find it by running FOR lool
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", optionList.get(5) );

			// Other way that I prefer is:
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", optionList.get(5) );
				
//				driver.manage().timeouts().implicitlyWait(com.amazon.utilities.TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
				
				
				}

}
