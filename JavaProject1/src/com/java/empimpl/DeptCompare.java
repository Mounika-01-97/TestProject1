package com.java.empimpl;

import java.util.Comparator;

import com.java.empbean.Student;

public class DeptCompare implements Comparator<Student>{
	public int compare(Student s1,Student s2){  
		return s1.dept.compareTo(s2.dept);  
	}
}
