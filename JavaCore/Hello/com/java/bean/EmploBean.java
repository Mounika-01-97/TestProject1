package com.java.bean;



public class EmploBean {
 int empid;
 String empname;
 double empsalary;

@Override
public String toString() {
	return "EmploBean [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(double empsalary) {
	this.empsalary = empsalary;
}

}
