package com.amazon.stepdefinations;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.amazon.pageobject.AddToCartPage;
import com.amazon.utilities.ConfigReader;

import com.amazon.utilities.ExcelReader;
import com.amazon.utilities.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStepDef extends TestBase{
	
	//Variable Declaration
	
	private WebDriver driver;
	private TestBase testBase;
	Properties prop;
	AddToCartPage addToCart;
	
	// Gerkin keywords 
	//Actions mapping through snippets
	@Given("^Open chromebrowser and type amazon url$")
	public void open_chromebrowser_and_type_amazon_url() throws Throwable {
//		prop = new Properties();
		testBase.initialization();		
		testBase.setUp();
	  addToCart =new AddToCartPage();
		
	}

	@Then("^User clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
	
		addToCart.SignUpClick();
	}
	
	@When("^user entering username and password from sheetname \"([^\"]*)\" and rownumber \"([^\"]*)\"$")
	public void user_entering_username_and_password_from_sheetname_and_rownumber(String sheetName, int rowNumber) throws Throwable {
		ExcelReader  reader=new ExcelReader();
		    
		List<Map<String,String>> testData =  reader.getData("C:\\Users\\LENOVO\\Desktop\\datas.xlsx",sheetName);
	    String uname = testData.get(rowNumber).get("username");
	    System.out.println(uname);
	    String pswd = testData.get(rowNumber).get("password");
	    System.out.println(pswd);
	    addToCart.enterUsernameAndPassword(uname, pswd);
	}

@When("^user click on login button$")
public void user_click_on_login_button() throws Throwable {

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
