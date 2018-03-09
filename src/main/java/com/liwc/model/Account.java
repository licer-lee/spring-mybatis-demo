package com.liwc.model;

import java.io.Serializable;


public class Account implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 2537445811452662364L;

	int id;
	
	Type type;

	String accountStr;

	String passwdStr;
	
	String note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getAccountStr() {
		return accountStr;
	}

	public void setAccountStr(String accountStr) {
		this.accountStr = accountStr;
	}

	public String getPasswdStr() {
		return passwdStr;
	}

	public void setPasswdStr(String passwdStr) {
		this.passwdStr = passwdStr;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	
	
	
	
	
	
}
