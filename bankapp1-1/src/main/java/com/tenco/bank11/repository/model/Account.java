package com.tenco.bank11.repository.model;

import java.sql.Timestamp;

public class Account {
	
	private Integer id;
	private String number;
	private String password;
	private Long balance;
	private Integer userId;
	private Timestamp createdAt;
	
	public void minus(Long amount) {
		this.balance -= amount;
	}
	public void plus(Long amount) {
		this.balance += amount; 
	}
}
