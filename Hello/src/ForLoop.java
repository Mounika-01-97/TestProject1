import java.util.Iterator;
import java.util.Scanner;

public class ForLoop {
	int id;
	String name;
	 
	public ForLoop(int id,String name) {
		
	this.id=id;
	this.name=name;

	
		display();
	}

 void display() {
	 System.out.println("stdId"+id);
	 System.out.println("stdName"+name);
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     for (int i = 0; i < 2; i++) {
    	 System.out.println("please enter stdId"); 
    	 int stdId=sc.nextInt();
    	 System.out.println("please enter stdName");
    	String stdName=sc.next();
    	 
    	ForLoop obj=new ForLoop(stdId,stdName);
	}
		
	}
	}


