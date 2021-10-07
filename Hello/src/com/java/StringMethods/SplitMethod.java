package com.java.StringMethods;

public class SplitMethod {
	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("welcome@to@my@firstprogram");
		String x=obj.toString();
		String[] v=x.split("@");
		for (String string : v) {
			System.out.println("from string buffer object===="+string);
		}
		String str="this@is@first@program";
		String[] sr=str.split("@");
		System.out.println(sr[2]);
		strMethod(sr[2]);
	}
	static void strMethod(String x) {
		System.out.println("x value-------"+x);
	}

}
