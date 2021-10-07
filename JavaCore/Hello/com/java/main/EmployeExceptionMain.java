package com.java.main;


import com.java.impl.AlreadyExistException;
import com.java.impl.EmployeeImpl;
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
	}
	
}     	            
      	     
          

	

    

	
	


