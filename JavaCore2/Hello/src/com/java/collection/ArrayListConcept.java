package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList<String> arlist=new ArrayList<>();	
		arlist.add("hhiu");
		arlist.add("rgerg");
	    arlist.add("erteryu");
	    arlist.add("mnbkjh");
	    System.out.println("arraylist size--"+arlist.size());
	    Iterator<String> cityIterator = arlist.iterator();  
	   
	  while(cityIterator.hasNext())   
	  {  
	  System.out.println(cityIterator.next());   
	  }  
	}
}
