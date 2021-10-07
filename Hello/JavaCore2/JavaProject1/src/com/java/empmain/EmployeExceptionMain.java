package com.java.empmain;

import java.util.Scanner;

import com.java.empi.EmployeeI;
import com.java.empimpl.AlreadyExistException;
import com.java.empimpl.EmployeeImpl;

public class EmployeExceptionMain {
	
    public static void main(String[] args) {
		
	
      	    {  
      	        try  
      	        {  
      	        	EmployeeImpl ob=new EmployeeImpl();
            	  	  ob.getEmployeeDetails();
            	  	  
      	        }  
      	        catch (AlreadyExistException ex)  
      	        {  
      	            System.out.println("Exception occured: " + ex);  
      	        }  
      	    }

	
}     } 	            
      	     
          

	

    

	
	


