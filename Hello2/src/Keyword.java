
public class Keyword {
	final String name="chikki";
	public void m1() {
		Keyword objs=new Keyword();
		String names=objs.name;
		String namess="mouna";
		System.out.println("name===="+name);
		System.out.println("names===="+namess);
		System.out.println("name===="+name);
	
	}
	public void m2() {
		this.m1();
		System.out.println("name===="+name);
	}
	

	public static void main(String[] args) {

		Keyword obj=new Keyword();
		obj.m2();

	}

}
