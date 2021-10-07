package com.java.driver;

import com.java.studentimpl.StudentDetailsImpl;
import com.java.studentservice.StdI;
import java.util.Scanner;

public class Driver {
 

public static void main(String[] args) {
	 StdI stdDetails=new StudentDetailsImpl();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("please enter stdId");
	 int id=sc.nextInt();
	 System.out.println("please enter stdName");
	 String name=sc.next();
	 System.out.println("please the addr");
	 String addr=sc.next();
	// stdDetails.registerStudentDetails();
	 
	 
	 
}
}
