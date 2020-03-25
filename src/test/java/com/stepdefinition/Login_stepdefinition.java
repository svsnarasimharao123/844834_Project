package com.stepdefinition;

import java.io.IOException;

import com.pages.Login_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepdefinition {
	
	Login_page login=new Login_page();
	
	@Given("^launch the browser$")
	public void launch_the_browser()  {
	    
		login.Browser_launch();
		
	}

	@When("^open the application$")
	public void open_the_application()  {
		
		login.Application_open();
	   
	}

	@When("^the user clicks on Login$")
	public void the_user_clicks_on_Login() {
	   
		login.Login_click();
	}

	@When("^enter username as \"([^\"]*)\" & password \"([^\"]*)\" and click on login$")
	public void enter_username_as_password_and_click_on_login(String username,String password) throws InterruptedException {
		
		login.User_details(username,password);
	   
	}

	@Then("^take screenshot$")
	public void take_screenshot() throws IOException  {
		login.Screenshot_page();
	   
	}


}
