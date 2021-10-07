package com.java.main;
import java.util.ArrayList;
import java.util.Collections;

import com.java.bean.Student;
import com.java.impl.DeptCompare;
import com.java.impl.FeeCompare;
import com.java.impl.NameCompare;
import com.java.impl.RollNo;

public class StdDriver {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Sitha",1000, "CSE"));  
		al.add(new Student(106,"Rama",6000, "ECE"));  
		al.add(new Student(105,"Jai",2000, "IT"));  
		al.add(new Student(103,"Sai",4000, "EEE"));
		
		System.out.println("Sorting by rollno"); 
		System.out.println("========================");
		Collections.sort(al,new RollNo());
		Collections.reverse(al);
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.fee+" "+st.dept);  
		}  
		System.out.println("Sorting by Name");
	    System.out.println("========================");
        Collections.sort(al,new NameCompare());  
		Collections.reverse(al);
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.fee+" "+st.dept);  
		}  
		System.out.println("sorting by fee");  
         System.out.println("=============================");
		Collections.sort(al,new FeeCompare());  
		 Collections.reverse(al);
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.fee+" "+st.dept);  
		}  
		System.out.println("Sorting by dept"); 
		System.out.println("===============================");
		Collections.sort(al,new DeptCompare());  
		Collections.reverse(al);  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.fee+" "+st.dept);  
		}  
	}

}
