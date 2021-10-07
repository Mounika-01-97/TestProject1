package com.java.main;

import com.java.impl.StudentImpl;
import com.java.inter.StudentI;

public class StudentMain {
	public static void main(String[] args) {
		StudentI obj=new StudentImpl();
		obj.getStudentDetails();
	}

}
