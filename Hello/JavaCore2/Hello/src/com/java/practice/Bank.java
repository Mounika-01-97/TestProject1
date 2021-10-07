package com.java.practice;

public class Bank {
	  
		int getRateOfInterest(){return 0;}  
		}  
		//Creating child classes.  
		class SBI extends Bank{  
		int getRateOfInterest(){return 8;}  
		}  
		  
		class ICICI extends Bank{  
		int getRateOfInterest(){return 7;}  
		}  
		class AXIS extends Bank{  
		int getRateOfInterest(){return 9;}  
		}  


