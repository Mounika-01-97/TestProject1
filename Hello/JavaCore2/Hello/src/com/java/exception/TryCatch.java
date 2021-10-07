package com.java.exception;

public class TryCatch {
	
		void add() throws ArithmeticException{
		try {
			System.out.println("welcome");
			int i=10/2;
			System.out.println("hello world");
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}finally {
			System.out.println("welcome to the patry");	
		}
		}
		void m2() {
			try {
				add();
				try {
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			} catch (Exception e) {
				try {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				// TODO: handle exception
			}
		}
	
  public static void main(String[] args) {
	TryCatch obj=new TryCatch();
	obj.add();
	
}
}