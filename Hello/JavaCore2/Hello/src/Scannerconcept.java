import java.util.Scanner;
public class Scannerconcept {
	int a;
	int b;
	public void add(int a,int b) {
		System.out.println("addtion method");
	int c=a+b;
	System.out.println("result"+c);
	}
   
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a");
	int x=sc.nextInt();
	System.out.println("enter the value of b");
	int y=sc.nextInt();
	Scannerconcept obj=new Scannerconcept();
	obj.add(x,y);

	}

}
