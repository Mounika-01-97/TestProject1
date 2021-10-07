
public class IfCondition {
	void IfMethod() {
	int age=20;
	int x=12;
	if(age>18)
	{
	System.out.println("eligible to vote!!");
	if(x>10) {
		System.out.println("x value");
	}else {
		System.out.println("else x value");
	}
	
	}else {
		System.out.println("not eligible to vote"); 
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 IfCondition obj=new  IfCondition();
		 obj.IfMethod();
	}

}
