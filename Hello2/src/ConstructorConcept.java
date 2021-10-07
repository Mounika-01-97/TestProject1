
public class ConstructorConcept {
	int x;
	int y;
	int z;
	String name;
	
	public ConstructorConcept(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public ConstructorConcept(int z,String name) {
		this.z=z;
		this.name=name;
	}
	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept(10,20);
		ConstructorConcept objs=new ConstructorConcept(30,"mouna");
		System.out.println("object data=="+obj.x);
		System.out.println("object data=="+obj.y);
		System.out.println("object data=="+objs.z);
		System.out.println("object data=="+objs.name);
	}

}