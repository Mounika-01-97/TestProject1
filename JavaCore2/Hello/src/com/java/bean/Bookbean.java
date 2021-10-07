package com.java.bean;

public class Bookbean {
  private int bookid;
	private String bookname;
	private int yop;
	private double selfnum;
	  
	
	public Bookbean(int bookid, String bookname, int yop, double selfnum) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.yop = yop;
		this.selfnum = selfnum;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	public double getSelfnum() {
		return selfnum;
	}
	public void setSelfnum(double selfnum) {
		this.selfnum = selfnum;
	}
	@Override
	public String toString() {
		return "Bookbean [bookid=" + bookid + ", bookname=" + bookname + ", yop=" + yop + ", selfnum=" + selfnum + "]";
		
	
		
	
		
	}
	
	
	}
	


