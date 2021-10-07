

public class MethodOverLoading {
	void m1(String adhar,int pan) {
		System.out.println("approved");
	}
	void m1(int x) {
		System.out.println("approved");
	}
	public static void main(String[] args) {
		MethodOverLoading obj=new MethodOverLoading();
	    obj.m1(123);
	   obj.m1("234",67);
	}
}
