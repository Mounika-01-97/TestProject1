import java.util.Scanner;

public class SwitchUseCase {
	String StdId="12";
	String StdName="mouna";
	String EmpId="23";
	String EmpName="mani";
	 void StdDetails() {
		 System.out.println("StdId=="+StdId);
		 System.out.println("StdName=="+StdName); 
	 }
	 void EmpDetails() {
		 System.out.println("EmpId=="+EmpId);
		 System.out.println("EmpName=="+EmpName);
	 }
	 public static void main(String[] args) {
		 SwitchUseCase obj=new SwitchUseCase();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the number");
		int number=sc.nextInt();
		switch(number) {
		case 1:
			obj.StdDetails();
			break;
		case 2:
			obj.EmpDetails();
			break;
		default:
				System.out.println("default condition");
			
		}
		
		
		
	}
	 }


