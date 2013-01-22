Feature: Depositing money in to a User account

@MoneyTransaction
Scenario: Depositing money in to User's account should add money to the User's current balance
Given a User has 0 money in their account
When 100 is deposited in to the account
Then the balance should be 100

Scenario: Withdrawing money from User's account should deduct money from the User's current balance
Given a User has 100 money in their account
When 50 is withdrawn from their account
Then the balance should be 50