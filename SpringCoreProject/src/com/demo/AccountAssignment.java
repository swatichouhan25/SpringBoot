package com.demo;

import java.util.Date;
import java.util.Map;

public class AccountAssignment {
	private int Acct_id;
	private String name;
	private String Acc_type;
	private Date date;
	private double balance;
	private Map<String, Address> address;
	
	public AccountAssignment() {
		
	}

	public AccountAssignment(int acct_id, String name, String acc_type, Date date, double balance,
			Map<String, Address> address) {
		super();
		Acct_id = acct_id;
		this.name = name;
		Acc_type = acc_type;
		this.date = date;
		this.balance = balance;
		this.address = address;
	}

	public int getAcct_id() {
		return Acct_id;
	}

	public void setAcct_id(int acct_id) {
		Acct_id = acct_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcc_type() {
		return Acc_type;
	}

	public void setAcc_type(String acc_type) {
		Acc_type = acc_type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Map<String, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}
	
	
	
	
	

}
