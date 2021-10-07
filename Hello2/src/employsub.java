
public class employsub extends employ{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");

	}
	public static void main(String[] args) {
		employ obj=new employsub();
		obj.m1();
		obj.m2();
	}
}