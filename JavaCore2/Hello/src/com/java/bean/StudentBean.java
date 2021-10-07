package com.java.bean;

public class StudentBean {
 private int id;
 private String name;
 private String addr;


public StudentBean(int id, String name, String addr) {
	
	this.id = id;
	this.name = name;
	this.addr = addr;
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
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
@Override
public String toString() {
	return "StudentBean [id=" + id + ", name=" + name + ", addr=" + addr + "]";
}
 
}
 

