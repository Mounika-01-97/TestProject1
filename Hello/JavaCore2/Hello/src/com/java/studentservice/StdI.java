package com.java.studentservice;

import com.java.bean.StudentBean;

public interface StdI {
	StudentBean registerStudentDetails(int id,String name,String addr); 
	//default interface is abstract class
	
	boolean isExitId();

	boolean isExitId(StudentBean bean);

	StudentBean registerStudentDetails1(int id, String name, String addr);

}
