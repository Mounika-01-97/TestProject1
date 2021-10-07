
public class Student {
	String name;
	int id;
	String address;
	public Student() {
		}
	public Student(String name,int id,String address) {
		this.name=name;
		this.id=id;
		this.address=address;
		display();
	}

	void display() {
		System.out.println("name--"+name);
		System.out.println("id--"+id);
		System.out.println("address--"+address);
	}
	public static void main(String[] args) {
		Student obj=new Student();
		obj.display();
	}
	
	

}