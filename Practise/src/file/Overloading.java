package file;

public class Overloading {

	public void add(int a, int b) {
		
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		ol.add(15, 200);
		ol.add(30, 60, 90);
		System.out.println(ol);

	}
	
}
