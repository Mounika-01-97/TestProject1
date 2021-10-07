package com.java.impl;

import java.util.ArrayList;
import java.util.Scanner;

import com.java.bean.StudentBean;
import com.java.inter.StudentI;



public class StudentImpl implements StudentI {

	@Override
	public ArrayList<StudentBean> getStudentDetails() {
		// TODO Auto-generated method stub
		ArrayList arrList= new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			StudentBean   x1=new StudentBean();
				x1.setId(10);
				x1.setName("Sitha");
				x1.setSal(200);
				x1.setDept("CSE");
				x1.setAddr("HYD");
				StudentBean	 x2=new StudentBean();
				x2.setId(12);
				x2.setName("Rama");
				x2.setSal(300);
				x2.setDept("ECE");
				x2.setAddr("KNR");
				StudentBean x3=new StudentBean();
				x3.setId(13);
				x3.setName("Radha");
				x3.setSal(400);
				x3.setDept("IT");
				x3.setAddr("USA");
	    arrList.add(x1);
		arrList.add(x2);
		arrList.add(x3);
		
	System.out.println("arraylist "+arrList);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the empname");
	String name=sc.next();
	if(name.equals(x1.getName())) {
		System.out.println("  "+x1.getId()+" "+x1.getName()+" "+x1.getSal()+" "+x1.getDept()+" "+x1.getAddr());
		}
	else if(name.equals(x2.getName())) {
		System.out.println(" "+x2.getId()+" "+x2.getName()+" "+x2.getSal()+" "+x2.getDept()+" "+x2.getAddr());
	}
	else if(name.equals(x3.getName())) {
		System.out.println(" "+x3.getId()+" "+x3.getName()+" "+x3.getSal()+" "+x3.getDept()+" "+x3.getAddr());
	}
	else {
		System.out.println("empname not found");
	}
	}
	return arrList;
	}
	
	}
	

