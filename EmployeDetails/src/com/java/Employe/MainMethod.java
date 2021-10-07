package com.java.Employe;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	EmployeInterface empDetails=new EmployeImpl();
		Scanner sc=new Scanner(System.in);
		 System.out.println("please enter empId");
		 int id=sc.nextInt();
		 System.out.println("please enter empName");
		 String name=sc.next();
		 System.out.println("please the grade");
		 String grade=sc.next();
		empDetails.getEmployeDetails();

	}

}
