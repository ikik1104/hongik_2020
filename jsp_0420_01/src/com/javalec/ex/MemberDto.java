package com.javalec.ex;

import java.sql.Timestamp;

public class MemberDto {

	public MemberDto() {
		
	}
	
	public MemberDto(String id,String pw,String name,String email,String address,Timestamp b_date) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.b_date = b_date;
	}
	
	private String id;
	private String pw;
	private String name;
	private String address;
	private String email;
	private Timestamp b_date;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getB_date() {
		return b_date;
	}

	public void setB_date(Timestamp b_date) {
		this.b_date = b_date;
	}
	
	
	
	
}
