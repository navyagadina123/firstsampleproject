package com.cg.bank;

public class BankAccount {
 int accountId;
 String accountHolderName;
 String accountType;
 String accountBalance;
 
public BankAccount() {
	super();
}

public BankAccount(int accountId, String accountHolderName, String accountType, String accountBalance) {
	super();
	this.accountId = accountId;
	this.accountHolderName = accountHolderName;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
}

public int getAccountId() {
	return accountId;
}

public void setAccountId(int accountId) {
	this.accountId = accountId;
}

public String getAccountHolderName() {
	return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(String accountBalance) {
	this.accountBalance = accountBalance;
}

@Override
public String toString() {
	return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
			+ accountType + ", accountBalance=" + accountBalance + "]";
}

 
}
