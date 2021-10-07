package com.java.exception;

public class ThrowException {
	void m1() throws ArithmeticException{
	int i=10/0;

	}
	void m2() {
		m1();
		 /*try {
			
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}		
		
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}}*/
	}
	public static void main(String[] args) {
		ThrowException obj=new ThrowException();
		try {
			obj.m2();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	}

		