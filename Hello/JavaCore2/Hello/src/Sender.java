
public class Sender {
	private String name;
	private String sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Sender [name=" + name + ", sal=" + sal + "]";
	}

}
