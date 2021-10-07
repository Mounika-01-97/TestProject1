package com.java.main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.java.bean.EmploBean;
import com.java.impl.EmployImpl;
import com.java.inter.EmployInter;

public class EmployeMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the empid");
        int empid=sc.nextInt();
        System.out.println("enter the empname");
        String empname=sc.next();
       System.out.println("enter the empsalary");
        double empsalary=sc.nextDouble();
     EmployInter emp=new EmployImpl();
        emp.getEmployDetails();
       ArrayList<EmploBean> arrList= emp.getEmployDetails();
        
        System.out.println("arraylist from bean"+arrList);
        
      HashMap<String, ArrayList<EmploBean>> map=  emp.getEmployRecords(empid, empname, empsalary);
        
        System.out.println("hashmap values--"+map);
        
				
        
    		    				}
			
      
		}
	


	
	
        
       
        
        
      
        
        
	


