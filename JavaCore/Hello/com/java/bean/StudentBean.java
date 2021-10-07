package com.java.bean;

public class StudentBean {
	int id;
	String name;
	double sal;
	String dept;
	String addr;
	public StudentBean() {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + ", addr=" + addr + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
