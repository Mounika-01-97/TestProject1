package com.java.empimpl;

import java.util.Comparator;

import com.java.empbean.Student;

public class FeeCompare implements Comparator<Student> {
	public int compare(Student s1,Student s2){  
		if(s1.fee==s2.fee)  
		return 0;  
		else if(s1.fee>s2.fee)  
		return 1;  
		else  
		return -1;  
		}  

}
