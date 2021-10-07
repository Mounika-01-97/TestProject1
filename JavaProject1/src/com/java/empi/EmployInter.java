package com.java.empi;

import java.util.ArrayList;
import java.util.HashMap;

import com.java.empbean.EmploBean;

public interface EmployInter {
	ArrayList<EmploBean> getEmployDetails();
	HashMap<String,ArrayList<EmploBean>> getEmployRecords(int id,String name,double sal);
}

