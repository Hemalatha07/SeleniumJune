package file;

public class TryCatch {

	public static void main(String[] args) {
	  int x = 425364874;
	  int y = 637627391;

		try {
			System.out.println(x*y);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		finally {
			System.out.println("THE END");
		}
	}

}
