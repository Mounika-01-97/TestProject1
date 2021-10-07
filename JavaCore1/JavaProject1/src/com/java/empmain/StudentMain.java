package com.java.empmain;

import com.java.empi.StudentI;
import com.java.empimpl.StudentImpl;

public class StudentMain {
	public static void main(String[] args) {
		StudentI obj=new StudentImpl();
		obj.getStudentDetails();
	}

}
