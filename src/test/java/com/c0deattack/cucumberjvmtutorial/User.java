package com.c0deattack.cucumberjvmtutorial;

public class User {

	public String Fname;
	public String Lname;
	public int age;	
	public Account account;

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public User(){
		this.Fname = "";
		this.Lname = "";
		this.age = 0;
		this.account = null;
	}
	
	public User(String Fname, String Lname, int age, Account account){
		this.Fname = Fname;
		this.Lname = Lname;
		this.age = age;
		this.account = account;
	}	
}
