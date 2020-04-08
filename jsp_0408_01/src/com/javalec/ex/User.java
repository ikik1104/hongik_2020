package com.javalec.ex;

public class User {

	private String name;
	private String id;
	private String pw;
	private String gender;
	private String addr;
	
	public User(){
		
	}
	
	public User(String name,String id, String pw, String gender, String addr){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.gender = gender;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
