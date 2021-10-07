package com.java.inter;

import java.util.ArrayList;

import com.java.bean.EmployeeBean;
import com.java.impl.AlreadyExistException;



public interface EmployeeI {
 ArrayList<EmployeeBean> getEmployeeDetails()throws AlreadyExistException;
}