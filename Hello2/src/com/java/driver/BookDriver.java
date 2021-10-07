package com.java.driver;
import java.util.Scanner;
import com.java.bean.Bookbean;

public class BookDriver {
	public BookDriver() {
	}
	    Bookbean[] registerbookdetails() {
		Bookbean obj[]= new Bookbean[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<2 ;i++){
		System.out.println("enter the bookid");
        int bookid=sc.nextInt();
        System.out.println("enter the bookname");
        String bookname=sc.next();
        System.out.println("enter the yop");
        int yop=sc.nextInt();
        System.out.println("enter the selfnum");
        double selfnum=sc.nextDouble();
         obj[i]=new Bookbean(bookid,bookname,yop,selfnum);
         }
		 allBookDetails(obj);
	     return obj;
	}
	 void allBookDetails(Bookbean[] x) {
		
		 for (int i = 0; i < x.length; i++) {
			Bookbean  Bookbean = x[i];
		Scanner sc1=new Scanner(System.in);
		System.out.println("get information by entering bookid");
		int bid=sc1.nextInt();		 
	if(Bookbean.getBookid()==bid) {
		
	System.out.println("bookid"+Bookbean.getBookid()+"bookname"+Bookbean.getBookname()+"yop"+Bookbean.getYop()+"selfnum"+Bookbean.getSelfnum());
		
		
	}else {
		System.out.println("no bookid is found");
	}
	}
	}
     public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 BookDriver obj1=new BookDriver();
	     obj1.registerbookdetails();
		 
     }
	  
		 
		 }
	 

