package com.java.exception;

public class AgeDriver {
	static int Age=10;
	public static void main(String[] args) {
		if(Age<11) {
			try {
				throw  new InvalidAge("your not valid to vote--");
				
			} catch (Exception e) {
				// TODO: handle exception
				e.getMessage();
				System.out.println(e.getMessage());
			}
		}
		else {
			
		System.out.println("welcome to vote--");
		}
		}	
	

}
