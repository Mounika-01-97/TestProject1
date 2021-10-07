package com.java.studentimpl;
import com.java.bean.StudentBean;
import com.java.studentservice.StdI;

public  class StudentDetailsImpl implements StdI {


	public StudentBean registerStudentDetails(int id, String name,String addr) {
		// TODO Auto-generated method stub
		
		StudentBean bean=new StudentBean(id,name,addr);
		  bean.setId(id);
		  bean.setName(name);
		  bean.setAddr(addr);
		  System.out.println(bean.toString()); 
		return bean;
	}
	
	
	
	
	
	@Override
	public StudentBean registerStudentDetails1(int id, String name, String addr) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public boolean isExitId() {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public boolean isExitId(StudentBean bean) {
		// TODO Auto-generated method stub
		return false;
	}









	
	

}
