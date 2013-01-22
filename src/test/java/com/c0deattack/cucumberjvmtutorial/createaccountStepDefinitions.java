package com.c0deattack.cucumberjvmtutorial;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class createaccountStepDefinitions {

	private static User user;
	
	@Before(value = "@AccountCreation")
	public void initialiseObj(){
		if( user == null){
			user = new User("Praveen","Sama",34,null);
		}
	}
	@Given("^a user does NOT have bank account$")
	public void a_user_does_NOT_have_bank_account() {
		//assertTrue("user already has account" + user.age , user.account == null);
	}

	@When("^he satisfies all required criteria$")
	public void he_satisfies_all_required_criteria() {
		assertTrue("User doesn't meet age requirement", user.age > 18);
	}

	@Then("^create a ([^\"]*) bank account for user$")
	public void create_a_bank_account_for_user(String accountType) {
		if (user.account == null){
			user.account = new Account(0,accountType);			
		}
		assertFalse("User account is created", user.account==null);
	}
}