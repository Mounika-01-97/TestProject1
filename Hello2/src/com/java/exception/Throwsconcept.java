package com.java.exception;

import java.io.IOException;

public class Throwsconcept {
void throwsconcept()throws IOException{  
	  System.out.println("device operation performed");  
	  try {
		System.out.println("welcome");
	} catch (Exception e) {
		// TODO: handle exception
	}
	 finally {
		 System.out.println("hello world");
	 }
}
	 public static void main(String args[])throws IOException{//declare exception  
		   Throwsconcept obj=new Throwsconcept();  
		   obj.throwsconcept();  
	  
	    System.out.println("normal flow...");  
	   }	  }  