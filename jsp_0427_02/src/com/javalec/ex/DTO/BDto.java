package com.javalec.ex.DTO;

import java.sql.Timestamp;

public class BDto {

	
	int Bid;
	String Bname;
	String Btitle;
	String Bcontent;
	Timestamp Bdate;
	int Bgroup;
	int Bhit;
	int Bstep;
	int Bindent;
	public BDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BDto(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bgroup, int bhit, int bstep,
			int bindent) {
		super();
		Bid = bid;
		Bname = bname;
		Btitle = btitle;
		Bcontent = bcontent;
		Bdate = bdate;
		Bgroup = bgroup;
		Bhit = bhit;
		Bstep = bstep;
		Bindent = bindent;
	}
	/**
	 * @return the bid
	 */
	public int getBid() {
		return Bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		Bid = bid;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return Bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		Bname = bname;
	}
	/**
	 * @return the btitle
	 */
	public String getBtitle() {
		return Btitle;
	}
	/**
	 * @param btitle the btitle to set
	 */
	public void setBtitle(String btitle) {
		Btitle = btitle;
	}
	/**
	 * @return the bcontent
	 */
	public String getBcontent() {
		return Bcontent;
	}
	/**
	 * @param bcontent the bcontent to set
	 */
	public void setBcontent(String bcontent) {
		Bcontent = bcontent;
	}
	/**
	 * @return the bdate
	 */
	public Timestamp getBdate() {
		return Bdate;
	}
	/**
	 * @param bdate the bdate to set
	 */
	public void setBdate(Timestamp bdate) {
		Bdate = bdate;
	}
	/**
	 * @return the bgroup
	 */
	public int getBgroup() {
		return Bgroup;
	}
	/**
	 * @param bgroup the bgroup to set
	 */
	public void setBgroup(int bgroup) {
		Bgroup = bgroup;
	}
	/**
	 * @return the bhit
	 */
	public int getBhit() {
		return Bhit;
	}
	/**
	 * @param bhit the bhit to set
	 */
	public void setBhit(int bhit) {
		Bhit = bhit;
	}
	/**
	 * @return the bstep
	 */
	public int getBstep() {
		return Bstep;
	}
	/**
	 * @param bstep the bstep to set
	 */
	public void setBstep(int bstep) {
		Bstep = bstep;
	}
	/**
	 * @return the bindent
	 */
	public int getBindent() {
		return Bindent;
	}
	/**
	 * @param bindent the bindent to set
	 */
	public void setBindent(int bindent) {
		Bindent = bindent;
	}
	
	
	
}
