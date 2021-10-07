package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");  
	    System.out.println("Initial list of elements: "+map);  
	     
	    /*map.remove("Amit");  
	    //System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(102, "Rahul");  
	    System.out.println("Updated list of elements: "+map);
	   // map.clear();
	    //System.out.println("clear all"+map);*/
	    map.replace(104, "Sanjay");
	    System.out.println("update---"+map);
	   }      
}


