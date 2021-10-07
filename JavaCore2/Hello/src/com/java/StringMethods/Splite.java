package com.java.StringMethods;

public class Splite {
	public static void main(String[] args) {
		String s1="dsfsdf zkhhusf";  
		String[] words=s1.split("\\s");  
		for(String w:words){  
		System.out.println(w);  
		}
		  String str = "Javatpointtt";  
	        System.out.println("Returning words:");  
	        String[] arr = str.split("a", 0);  
	        for (String w : arr) {  
	            System.out.println(w);  
	        }  
	        System.out.println("Split array length: "+arr.length);  
	    }  
		}

	


