import java.util.Scanner;

public class Globalvariables {
	String name;
	double salary;
	public void m1(String name,double salary) {
	System.out.println("enter the name"+name);
	System.out.println("enter the salary"+salary);
	this.name=name;
	this.salary=salary;
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the salary");
		int salary=sc.nextInt();
		Globalvariables obj=new Globalvariables();
		obj.m1(name,salary);

	}

}
