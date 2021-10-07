package com.java.bean;

public class EmployeeBean {
public int id;
public String name;
public double sal;
public String dept;
public EmployeeBean() {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
	this.dept = dept;
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
@Override
public String toString() {
	return "EmployeeBean [id=" + id + ", name=" + name + ", sal=" + sal + ", dept=" + dept + "]";
}
}
