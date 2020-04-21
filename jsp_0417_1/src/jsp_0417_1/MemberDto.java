package jsp_0417_1;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberDto {

	public MemberDto(){
		
	}
	public MemberDto(int num,String id,String pw,String name,String email,String address,String phone,Timestamp birth
			,String gender, String news, String sms, Timestamp m_date) {
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birth = birth;
		this.gender = gender;
		this.news = news;
		this.sms = sms;
		this.m_date = m_date;
	}
	
	private int num;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address;
	private String phone;
	private Timestamp birth;
	private String gender;
	private String news;
	private String sms;
	private Timestamp m_date;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getBirth() {
		return birth;
	}
	public void setBirth(Timestamp birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getSms() {
		return sms;
	}
	public void setSms(String sms) {
		this.sms = sms;
	}
	public Timestamp getM_date() {
		return m_date;
	}
	public void setM_date(Timestamp m_date) {
		this.m_date = m_date;
	}
	
	
	
	
}
