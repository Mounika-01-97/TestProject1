package com.java.empmain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.java.empbean.EmploBean;
import com.java.empi.EmployInter;
import com.java.empimpl.AlreadyExistException;
import com.java.empimpl.EmployImpl;
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
	


	
	
        
       
        
        
      
        
        
	


