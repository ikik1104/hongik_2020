package com.javalec.ex;

public class Member {

	private String name;
	private String id;
	private String pw;
	private String gender;
	private String job;
	private String[] hobby;
	private String nick_name;
	
	public Member(){
		
	}
	public Member(String name, String id, String pw, String gender, String job, String[] hobby){
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.gender = gender;
		this.job = job;
		this.hobby = hobby;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	
	
	
}
