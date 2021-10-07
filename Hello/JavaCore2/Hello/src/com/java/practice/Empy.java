package com.java.practice;

public class Empy extends Student {
	int id;
	String name;
	float salary;  
	Empy(int id,String name,float salary){  
	super(id,name);//reusing parent constructor  
	this.salary=salary;  
	}  
	void display(){
	System.out.println(id+" "+name+" "+salary);  
	}
  static void main(String[] args){  
	Empy e1=new Empy(1,"ankit",45000f);  
	e1.display();  
	}
	}
