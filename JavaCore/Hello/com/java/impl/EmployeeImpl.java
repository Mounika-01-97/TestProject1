package com.java.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.java.bean.EmployeeBean;
import com.java.inter.EmployeeI;




public class EmployeeImpl implements EmployeeI  {
	 @Override
	public ArrayList<EmployeeBean> getEmployeeDetails()throws AlreadyExistException{
	 ArrayList arrList=new ArrayList();
	 
		EmployeeBean x1=new EmployeeBean();
		x1.setId(10);
		x1.setName("sitha");
		x1.setSal(100);
		x1.setDept("cse");
		EmployeeBean x2=new EmployeeBean();
		x2.setId(12);
		x2.setName("rama");
		x2.setSal(200);
		x2.setDept("ece");
		EmployeeBean x3=new EmployeeBean();
	    x3.setId(14);
		x3.setName("radha");
		x3.setSal(400);
		x3.setDept("it");
		arrList.add(x1);
		arrList.add(x2);
		arrList.add(x3);
		System.out.println("arraylist"+arrList);
	 
	
	   Scanner sc=new Scanner(System.in);
	  	System.out.println("enter the empid");
	      int x=sc.nextInt();
	      
	      if(x1.getId()==x){
	  System.out.println(" "+x1.getId()+" "+x1.getName()+" "+x1.getSal()+" "+x1.getDept());
	  throw new AlreadyExistException ("empid already exist please try with another");

	    	  				}
	  else	if(x2.getId()==x) {
	   System.out.println(" "+x2.getId()+" "+x2.getName()+" "+x2.getSal()+" "+x2.getDept());
	   throw new AlreadyExistException ("empid already exist please try with another");

	   }
	 else if(x3.getId()==x) {
	System.out.println(" "+x3.getId()+" "+x3.getName()+" "+x3.getSal()+" "+x1.getDept());
	throw new AlreadyExistException ("empid already exist please try with another");

	   } else
	   {
		   System.out.println("empid is not found");
	   }
		return arrList; 
	
	      
	   
		  
	      
		

}     


}