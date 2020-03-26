package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.Login_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepdefinition {
	
	
WebDriver driver;
	
	public Login_page  login=new Login_page(driver);
	
	
	@Given("^the user launch the application$")
	public void the_user_launch_the_application()  {
	    login.application("chrome", "https://www.demoblaze.com/");
	}
	@When("^the user clicks on login link$")
	public void the_user_clicks_on_login_link()  {
	    
		
		login.Login_linkclick();
	}

	@When("^the user enter username as \"([^\"]*)\" & password \"([^\"]*)\"$")
	public void the_user_enter_username_as_password(String username, String password) {
		
		
		login.Enter_logindetails(username, password);
	}

	@Then("^click on login button$")
	public void click_on_login_button()  {
		login.login_buttonclick();
		
	}


}


