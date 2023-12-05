package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PageObjects;

public class LoginStep {

	PageObjects pb = new PageObjects(WebshopHooks.driver);
	@When("User click on Login")
	public void user_click_on_login() {
	   
		
		pb.clickLogin();
		
	}

	@Then("User enter username {string}")
	public void user_enter_username(String string) {
	    
		pb.enteruser(string);
	}

	@Then("User enter password {string}")
	public void user_enter_password(String string) {
	    
		pb.enterpass(string);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	   
		pb.clickLoginBtn();
	}

	

	@Then("User click on Logout button")
	public void user_click_on_logout_button() {
	    
		pb.clickLogout();
	}
}
