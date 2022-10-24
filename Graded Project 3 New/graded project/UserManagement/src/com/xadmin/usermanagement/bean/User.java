package com.xadmin.usermanagement.bean;

public class User {
	
	private int Id ;
	private String fname ; 
	private String lname ;
	private String email ;
	
	
	public User(String fname, String lname, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public User(int id, String fname, String lname, String email) {
		super();
		Id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
