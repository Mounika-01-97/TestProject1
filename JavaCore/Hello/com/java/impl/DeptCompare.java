package com.java.impl;

import java.util.Comparator;

import com.java.bean.Student;

public class DeptCompare implements Comparator<Student>{
	public int compare(Student s1,Student s2){  
		return s1.dept.compareTo(s2.dept);  
	}
}
