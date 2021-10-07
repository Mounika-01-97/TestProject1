package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Virat");
        Iterator i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
        //ll.clear();  
        //ll.removeFirstOccurrence("Gaurav");
        //ll.remove(1);  
        //ll.removeLast();
        System.out.println(" "+ll);
	}

}
