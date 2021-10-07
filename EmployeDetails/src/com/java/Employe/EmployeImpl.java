package com.java.Employe;

import java.util.ArrayList;

public  class EmployeImpl implements EmployeInterface   {

	public ArrayList<EmployeBean> getEmployeDetails(Employe obj) {
		// TODO Auto-generated method stub
try {
	ArrayList<EmployeBean> ob=new ArrayList<>();
      ob.set(0, null);
	  ob.add("AJAY");
	  ob.add("A");
	  System.out.println(ob.toString()); 
	
    } catch (Exception e) {
	
	e.printStackTrace();
}
return ob;
   
	}

	@Override
	public ArrayList<EmployeBean> getEmployeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getEmployeDetails1() {
		// TODO Auto-generated method stub
		
	}

	

	

}
