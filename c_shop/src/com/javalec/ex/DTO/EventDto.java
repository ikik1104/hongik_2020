package com.javalec.ex.DTO;

import java.sql.Timestamp;

public class EventDto {

	
	int num;
	String title;
	String content;
	String file1;
	String file2;
	String start_day;
	String end_day;
	int hit;
	public EventDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventDto(int num, String title, String content, String file1, String file2, String start_day,
			String end_day, int hit) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.file1 = file1;
		this.file2 = file2;
		this.start_day = start_day;
		this.end_day = end_day;
		this.hit = hit;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the file1
	 */
	public String getFile1() {
		return file1;
	}
	/**
	 * @param file1 the file1 to set
	 */
	public void setFile1(String file1) {
		this.file1 = file1;
	}
	/**
	 * @return the file2
	 */
	public String getFile2() {
		return file2;
	}
	/**
	 * @param file2 the file2 to set
	 */
	public void setFile2(String file2) {
		this.file2 = file2;
	}
	/**
	 * @return the start_day
	 */
	public String getStart_day() {
		return start_day;
	}
	/**
	 * @param start_day the start_day to set
	 */
	public void setStart_day(String start_day) {
		this.start_day = start_day;
	}
	/**
	 * @return the end_day
	 */
	public String getEnd_day() {
		return end_day;
	}
	/**
	 * @param end_day the end_day to set
	 */
	public void setEnd_day(String end_day) {
		this.end_day = end_day;
	}
	/**
	 * @return the hit
	 */
	public int getHit() {
		return hit;
	}
	/**
	 * @param hit the hit to set
	 */
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
	
	
	
}
