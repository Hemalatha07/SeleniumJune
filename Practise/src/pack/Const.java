package pack;

public class Const {
		
	int a;
	String b;
		
	public Const(int x,String y) {
		a=x;
		b=y;		
	}
	
	public static void main(String[] args) {
		Const C=new Const(500,"Hema");	
		System.out.print(C.a+C.b);
		
	}
	

}
