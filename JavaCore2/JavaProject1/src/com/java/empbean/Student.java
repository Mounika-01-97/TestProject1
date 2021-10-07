package com.java.empbean;

public class Student {
	public int rollno;  
	public String name;  
	public double fee;
	public String dept;
	public Student(int rollno, String name, double fee, String dept) {
		
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fee=" + fee + ", dept=" + dept + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
