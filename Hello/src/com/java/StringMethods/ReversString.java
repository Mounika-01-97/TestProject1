package com.java.StringMethods;

public class ReversString {
public static void main(String[] args) {
	String str = "Welcome To JavaTpoint";  
	int size = str.length();  
	  
	System.out.println("Reverse of the string: " + "'" + str + "'" + " is");  
	  
	for(int i = 0; i < size; i++)  
	{  
	  System.out.println(str.charAt(str.length() - i - 1));  
	} 
	
}
}
