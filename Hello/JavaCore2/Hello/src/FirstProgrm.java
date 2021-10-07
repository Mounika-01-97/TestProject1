
public class FirstProgrm { 
	public static void m1() {
		System.out.println("static method");
	}
	public void m2() {                      //instance or object
	 System.out.println("object program");
		
	}
	public void m3() 
	{
		System.out.println("m3 method");
	}
	public void m4() {
	 m3();
	 System.out.println("m4 method");
	
	}
	public static void m5() {
		System.out.println("m5 method");
	
	}public static void m6() {
		m5();
		System.out.println("m6 method");
		
	}
	public void m9(){
		FirstProgrm obj=new FirstProgrm();
		m10();
	}
	public static void m10() {
		FirstProgrm obj=new FirstProgrm();
		obj.m9();
		
		
	}
	public static void main(String[] args) {
		
	 {
		// TODO Auto-generated method stub
		System.out.println("first program");
		m1();
		FirstProgrm obj=new FirstProgrm();
		obj.m2();
		obj.m4();
		obj.m6();
	}

}
}
