package com.java.empi;

import java.util.ArrayList;

import com.java.empbean.EmployeeBean;
import com.java.empimpl.AlreadyExistException;

public interface EmployeeI {
ArrayList<EmployeeBean> getEmployeeDetails() throws AlreadyExistException;
}
