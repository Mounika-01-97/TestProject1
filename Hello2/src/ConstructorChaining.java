
public class ConstructorChaining {
	
	public ConstructorChaining() {
		this(10);
	System.out.println("default constructor");
		
	}
	public ConstructorChaining(int x) {
		this(20,30);
		System.out.println("one param constructor");
	}
	public ConstructorChaining(int x,int y) {
		System.out.println("two param constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining obj=new ConstructorChaining();
		System.out.println("main method");

	}

}
