$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\c0deattack\cucumberjvmtutorial\deposit.feature');
formatter.feature({
  "id": "depositing-money-in-to-a-user-account",
  "description": "",
  "name": "Depositing money in to a User account",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "depositing-money-in-to-a-user-account;depositing-money-in-to-user\u0027s-account-should-add-money-to-the-user\u0027s-current-balance",
  "tags": [
    {
      "name": "@UserAccounts",
      "line": 3
    }
  ],
  "description": "",
  "name": "Depositing money in to User\u0027s account should add money to the User\u0027s current balance",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "a User has 0 money in their account",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "100 is deposited in to the account",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "the balance should be 100",
  "keyword": "Then ",
  "line": 7
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 11
    }
  ],
  "location": "DepositStepDefinitions.a_User_has_£_money_in_their_account(int)"
});
formatter.result({
  "duration": 505867712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 0
    }
  ],
  "location": "DepositStepDefinitions.£_is_deposited_in_to_the_account(int)"
});
formatter.result({
  "duration": 81112,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 22
    }
  ],
  "location": "DepositStepDefinitions.the_balance_should_be_£(int)"
});
formatter.result({
  "duration": 92370,
  "status": "passed"
});
formatter.scenario({
  "id": "depositing-money-in-to-a-user-account;withdrawing-money-from-user\u0027s-account-should-deduct-money-from-the-user\u0027s-current-balance",
  "description": "",
  "name": "Withdrawing money from User\u0027s account should deduct money from the User\u0027s current balance",
  "keyword": "Scenario",
  "line": 9,
  "type": "scenario"
});
formatter.step({
  "name": "a User has 100 money in their account",
  "keyword": "Given ",
  "line": 10
});
formatter.step({
  "name": "50 is withdrawn from their account",
  "keyword": "When ",
  "line": 11
});
formatter.step({
  "name": "the balance should be 50",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 11
    }
  ],
  "location": "DepositStepDefinitions.a_User_has_£_money_in_their_account(int)"
});
formatter.result({
  "duration": 53603,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 0
    }
  ],
  "location": "DepositStepDefinitions.£_is_withdrawn_from_their_account(int)"
});
formatter.result({
  "duration": 55192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 22
    }
  ],
  "location": "DepositStepDefinitions.the_balance_should_be_£(int)"
});
formatter.result({
  "duration": 44891,
  "status": "passed"
});
});