package com.example.board;

import java.util.Date;

public class BoardVO {
	private int seq;
	private String title;
	private String category;
	private String writer;
	private String content;
	private Date regdate;
	private int cnt;

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	private int Year;
	private float star;



	public float getStar() {
		return star;
	}

	public void setStar(float star) {
		this.star = star;
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCategory() { return category; }

}
