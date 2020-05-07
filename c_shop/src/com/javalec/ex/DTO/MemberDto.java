package com.javalec.ex.DTO;

import java.sql.Timestamp;

import org.apache.tomcat.jni.Time;


public class MemberDto {

	private int mnum;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String postcode;
	private String address;
	private String address2;
	private String address3;
	private String phone;
	private String birth;
	private String day2;
	private String gender;
	private String news;
	private String sms;
	private Timestamp joindate;
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberDto(int mnum, String id, String pw, String name, String email, String postcode, String address,
			String address2, String address3, String phone, String birth, String day2, String gender, String news,
			String sms, Timestamp joindate) {
		super();
		this.mnum = mnum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.postcode = postcode;
		this.address = address;
		this.address2 = address2;
		this.address3 = address3;
		this.phone = phone;
		this.birth = birth;
		this.day2 = day2;
		this.gender = gender;
		this.news = news;
		this.sms = sms;
		this.joindate = joindate;
	}
	/**
	 * @return the mnum
	 */
	public int getMnum() {
		return mnum;
	}
	/**
	 * @param mnum the mnum to set
	 */
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}
	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode() {
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	/**
	 * @return the address3
	 */
	public String getAddress3() {
		return address3;
	}
	/**
	 * @param address3 the address3 to set
	 */
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the birth
	 */
	public String getBirth() {
		return birth;
	}
	/**
	 * @param birth the birth to set
	 */
	public void setBirth(String birth) {
		this.birth = birth;
	}
	/**
	 * @return the day2
	 */
	public String getDay2() {
		return day2;
	}
	/**
	 * @param day2 the day2 to set
	 */
	public void setDay2(String day2) {
		this.day2 = day2;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the news
	 */
	public String getNews() {
		return news;
	}
	/**
	 * @param news the news to set
	 */
	public void setNews(String news) {
		this.news = news;
	}
	/**
	 * @return the sms
	 */
	public String getSms() {
		return sms;
	}
	/**
	 * @param sms the sms to set
	 */
	public void setSms(String sms) {
		this.sms = sms;
	}
	/**
	 * @return the joindate
	 */
	public Timestamp getJoindate() {
		return joindate;
	}
	/**
	 * @param joindate the joindate to set
	 */
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	
	
	
}



