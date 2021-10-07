package com.java.studentimpl;

import com.java.bean.Bookbean;
import com.java.bean.StudentBean;
import com.java.studentservice.BookI;

public  class BookImpl  implements BookI{

	
	public Bookbean registerbookdetails(int bookid,String bookname,int yop,double selfnum) {
		// TODO Auto-generated method stub
		Bookbean bean=new Bookbean(bookid, bookname, yop, selfnum);
		  bean.setBookid(bookid);
		  bean.setBookname("bookname");
		  bean.setYop(yop);
		  bean.setSelfnum(selfnum);
		  System.out.println(bean.toString());
		return bean;
	
	
	}

	@Override
	public Bookbean registerbookdetails() {
		// TODO Auto-generated method stub
		return null;
	}

	}



