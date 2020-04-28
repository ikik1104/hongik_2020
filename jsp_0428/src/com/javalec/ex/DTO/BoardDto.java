package com.javalec.ex.DTO;

import java.sql.Timestamp;

public class BoardDto {

	
	
	int bid;
	String bname;
	String btitle;
	String bcontent;
	Timestamp bdate;
	int bhit;
	int bgroup;
	int bstep;
	int bindent;
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDto(int bid, String bname, String btitle, String bcontent, Timestamp bdate, int bhit, int bgroup,
			int bstep, int bindent) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bdate = bdate;
		this.bhit = bhit;
		this.bgroup = bgroup;
		this.bstep = bstep;
		this.bindent = bindent;
	}
	/**
	 * @return the bid
	 */
	public int getBid() {
		return bid;
	}
	/**
	 * @param bid the bid to set
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * @return the btitle
	 */
	public String getBtitle() {
		return btitle;
	}
	/**
	 * @param btitle the btitle to set
	 */
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	/**
	 * @return the bcontent
	 */
	public String getBcontent() {
		return bcontent;
	}
	/**
	 * @param bcontent the bcontent to set
	 */
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	/**
	 * @return the bdate
	 */
	public Timestamp getBdate() {
		return bdate;
	}
	/**
	 * @param bdate the bdate to set
	 */
	public void setBdate(Timestamp bdate) {
		this.bdate = bdate;
	}
	/**
	 * @return the bhit
	 */
	public int getBhit() {
		return bhit;
	}
	/**
	 * @param bhit the bhit to set
	 */
	public void setBhit(int bhit) {
		this.bhit = bhit;
	}
	/**
	 * @return the bgroup
	 */
	public int getBgroup() {
		return bgroup;
	}
	/**
	 * @param bgroup the bgroup to set
	 */
	public void setBgroup(int bgroup) {
		this.bgroup = bgroup;
	}
	/**
	 * @return the bstep
	 */
	public int getBstep() {
		return bstep;
	}
	/**
	 * @param bstep the bstep to set
	 */
	public void setBstep(int bstep) {
		this.bstep = bstep;
	}
	/**
	 * @return the bindent
	 */
	public int getBindent() {
		return bindent;
	}
	/**
	 * @param bindent the bindent to set
	 */
	public void setBindent(int bindent) {
		this.bindent = bindent;
	}
	
	
	
}
