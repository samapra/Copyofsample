Feature: Creating User account

@AccountCreation
Scenario: Create account for a user
Given a user does NOT have bank account
When he satisfies all required criteria
Then create a current bank account for user

Scenario: Create account for a user
Given a user does NOT have bank account
When he satisfies all required criteria
Then create a saving bank account for user