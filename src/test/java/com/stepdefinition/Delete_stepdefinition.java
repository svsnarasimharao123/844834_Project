package com.stepdefinition;

import java.io.IOException;

import com.pages.Deletecart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Delete_stepdefinition {
	Deletecart_page product=new Deletecart_page();

	@Given("^user launched Demoblaze application$")
	
	public void user_launched_Demoblaze_application() {
	    product.demoblaze_homePage();
	}

	@When("^user selects  the product and addtocart$")
	public void user_selects_the_product_and_addtocart() {
	    product.Select_product();
	}

	@When("^the user clicks on Cart button$")
	public void the_user_clicks_on_Cart_button() throws IOException, InterruptedException {
	   product.Addto_cart();
	}

	@When("^the user remove the added product from cart$")
	public void the_user_remove_the_added_product_from_cart()  {
		
		product.Deletefrom_cart();
	  
	}


}
