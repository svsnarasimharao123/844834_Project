package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pages.Login_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepdefinition {
	
	
WebDriver driver;
	
	public Login_page  login=new Login_page(driver);                          //Login page object creation
	
	
	@Given("^the user launch the application$")
	public void the_user_launch_the_application()  {
	    login.application("chrome", "https://www.demoblaze.com/");            //Accessing the  launch browser and application method
	}
	@When("^the user clicks on login link$")
	public void the_user_clicks_on_login_link()  {
	    
		
		login.Login_linkclick();                                              //Accessing the click login link  method
	}

	@When("^the user enter username as \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void the_user_enter_username_as_password(String username, String password) throws InterruptedException {
		
		
		login.Enter_logindetails(username, password);                          //Accessing the sending  sending usernsme and password method
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws InterruptedException, IOException  {
		
		login.login_buttonclick();                                            //Accessing the Login click method 
		
	}


}


