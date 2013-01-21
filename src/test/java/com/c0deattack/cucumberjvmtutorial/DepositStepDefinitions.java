package com.c0deattack.cucumberjvmtutorial;

import static org.junit.Assert.assertTrue;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class DepositStepDefinitions {

	private static User user;
	private static Account account;
	
	@Before(value="@UserAccounts")
	public void initialiseObj(){
		if( user == null){
			user = new User();
		}
		if (account == null){
			account = new Account();
		}
	}
	
	@Given("^a User has (\\d+) money in their account$")
	public void a_User_has_£_money_in_their_account(int amount) {

	    //user.setAccount(account);
	    assertTrue("The balance is not equal to expected balance", account.getBalance() == amount);
	}

	@When("^(\\d+) is deposited in to the account$")
	public void £_is_deposited_in_to_the_account(int amount) {
	    account.deposit(amount);
	}

	@Then("^the balance should be (\\d+)$")
	public void the_balance_should_be_£(int expectedBalance) {
		   int currentBalance = account.getBalance();
	       assertTrue("The expected balance was " + expectedBalance +" but actually was: " + currentBalance, currentBalance == expectedBalance);
	   }
	
	@When("^(\\d+) is withdrawn from their account$")
	public void £_is_withdrawn_from_their_account(int amount) {
		account.withdraw(amount);
	}
}