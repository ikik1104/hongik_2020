package com.javalec.ex;

import java.sql.Timestamp;

public class MemberDto {

	
	public MemberDto(){
		
	}
	
	public MemberDto(String id,String pw, String name,String email,String address1, String address2,String address3,Timestamp b_date,Timestamp u_date) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.b_date = b_date;
		this.u_date = u_date;
	}
	
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address1;
	private String address2;
	private String address3;
	private Timestamp b_date;
	private Timestamp u_date;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public Timestamp getB_date() {
		return b_date;
	}

	public void setB_date(Timestamp b_date) {
		this.b_date = b_date;
	}

	public Timestamp getU_date() {
		return u_date;
	}

	public void setU_date(Timestamp u_date) {
		this.u_date = u_date;
	}
	
	
}
