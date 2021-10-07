import java.util.Objects;

public class ArrayConcept {
	int id;
	String name;
	double sal;
  public ArrayConcept(int id, String name, double sal) {
	     this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public ArrayConcept() {
		// TODO Auto-generated constructor stub
	}

	void inArray() {
		int x[]=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			
		}
		strArray();
	}
		
	 void strArray() {
		String x[]=new String[3];
		x[0]="aaa";
		x[1]="bbbb";
		x[2]="ccc";
		for (int i = 0; i <x.length; i++) {
			System.out.println(x[i]);
			
		}
		objArray();
		
	}
	 void objArray() {
		Object x[]=new Object[4];
		 x[0]=12;
		 x[1]="abc";
		 x[2]=100.30;
		 x[3]=203.50;
		 for(int i=0;i<x.length;i++) {
			 System.out.println("object Array"+x[i]);
		 }
		 objeArray();
	 }
	 void objeArray()
	 {
		 ArrayConcept arryconcept1=new  ArrayConcept(12,"hello",100.20);
		 ArrayConcept arryconcept2=new  ArrayConcept(13,"hai",200.20);
		 ArrayConcept arryconcept3=new  ArrayConcept(14,"welcom",300.20);
		 ArrayConcept arryconcept4=new  ArrayConcept(15,"hello",400.20);
		 ArrayConcept[] obj =new ArrayConcept[4];
		 obj[0]=arryconcept1;
		 obj[1]=arryconcept2;
		 obj[2]=arryconcept3;
		 obj[3]=arryconcept4;
		 
		 for (int i = 0; i < obj.length; i++) {
			System.out.println("arrayvalues"+obj[i].id+obj[i].name+obj[i].sal);
			
		 }
		}
			public static void main(String[] args) {
		 ArrayConcept obj=new ArrayConcept();
		 obj.inArray();
		 
		
	}
		
	}


	
		
	
