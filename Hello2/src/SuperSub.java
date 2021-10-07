
public class SuperSub  extends SuperkeyWord{
	public SuperSub(){
		
	}
	public SuperSub(int x) {
		 super(50);
	}
	void addsub() {
		String na=super.name;
		System.out.println("name===="+name);
	
	String wel=super.addSuperMethod();
	System.out.println("===="+wel);

}
}