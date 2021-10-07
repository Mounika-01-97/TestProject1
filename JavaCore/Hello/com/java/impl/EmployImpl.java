package com.java.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.java.bean.EmploBean;
import com.java.inter.EmployInter;



public class EmployImpl implements EmployInter {

	@Override
	public ArrayList<EmploBean> getEmployDetails() {
		// TODO Auto-generated method stub
	    ArrayList arrList= new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			/*EmploBean x=new EmploBean();
			x.setEmpid(x.getEmpid());
			x.setEmpname(x.getEmpname());
			x.setEmpsalary(x.getEmpsalary());*/
	     EmploBean x1=new EmploBean();
				x1.setEmpid(11);
				x1.setEmpname("sitha");
				x1.setEmpsalary(200);
			EmploBean x2=new EmploBean();
				x2.setEmpid(12);
				x2.setEmpname("krishna");
			     x2.setEmpsalary(300);
			     EmploBean x3=new EmploBean();
				x3.setEmpid(14);
				x3.setEmpname("remo");
				x3.setEmpsalary(400);
		//arrList.add(x);		
	    arrList.add(x1);
		arrList.add(x2);
		arrList.add(x3);
		
	System.out.println("arraylist impl class"+arrList);
		
	
		Scanner sc1=new Scanner(System.in);
			System.out.println("enter the empid");
	        int y=sc1.nextInt();
			if(y==x1.getEmpid()) {
    System.out.println(" "+x1.getEmpid()+" "+x1.getEmpname()+" "+x1.getEmpsalary());
				}
        else	if(y==x2.getEmpid()) {
    System.out.println(" "+x2.getEmpid()+" "+x2.getEmpname()+" "+x2.getEmpsalary());
				}
       else		if(y==x3.getEmpid()) {
	System.out.println(" "+x3.getEmpid()+" "+x3.getEmpname()+" "+x3.getEmpsalary());
							} 
				else {
					System.out.println("empid not found");
				}
	}
		return arrList;
	}
	
	@Override
	public HashMap<String, ArrayList<EmploBean>> getEmployRecords(int id, String name, double sal) {
		// TODO Auto-generated method stub
		
		HashMap map=new HashMap();
	   ArrayList list= new ArrayList();
		try {
			EmploBean obj=new EmploBean();
			obj.setEmpid(10);
			obj.setEmpname("ram");
			obj.setEmpsalary(100);
			
			list.add(obj);
			
			map.put("first",list);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
		
	
		 
		return map;
	
	}

}

