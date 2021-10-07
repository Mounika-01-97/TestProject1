
public class GlobalVarWithMethod {
	int x;
	int y;
	int c;
	int d;
	public GlobalVarWithMethod() {
		this.x=x;
		this.y=y;
	}
	void getGlobalVars(int x,int y) {
		GlobalVarWithMethod obj=new GlobalVarWithMethod(20,30);	
	}
	public GlobalVarWithMethod(int c,int d) {
	this.c=c;
	this.d=d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlobalVarWithMethod obj=new GlobalVarWithMethod(10,20);
		//obj.GlobalVarWithMethod(10,20);

	}

}
