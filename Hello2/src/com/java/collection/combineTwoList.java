
package com.java.collection;

import java.util.ArrayList;


public class combineTwoList {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add("A");
		obj.add(100);
	  ArrayList obx=new ArrayList();
		obx.add(2);
		obx.add("B");
		obx.add(200);
		
  obj.addAll(obx);	
		
	System.out.println("the combine values---"+obj);
	}

}
