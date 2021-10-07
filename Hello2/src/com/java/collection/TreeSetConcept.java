package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetConcept {
	public static void main(String args[]){  
		  //Creating and adding elements 
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(24);  
        set.add(66);  
        set.add(12);  
        set.add(15);  
        System.out.println("Highest Value: "+set.pollFirst());  
        System.out.println("Lowest Value: "+set.pollLast());  
}   
		  
}
