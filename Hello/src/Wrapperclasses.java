
public class Wrapperclasses {
	public static void main(String[] args) {
		 String a="10";
		 Integer i=Integer.valueOf(a);
		 int z=i;
		 System.out.println("z value"+z);

		 int x=23;
		 String y= String.valueOf(x);
		 int ix=Integer.valueOf((String)y);
		 System.out.println("ix value"+ix);
		 
		 double d=100.20;
		 String b=String.valueOf(d);
		 System.out.println("b value"+b);
		 
		 float f=12.03f;
		 String ai=String.valueOf(f);
		 System.out.println("f value"+f);
		  
		
		 
		 
	}

}
