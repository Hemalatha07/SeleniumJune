package file;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		String str1 = "";
		int lenght = str.length();
//		System.out.println(length);
		for (int i = lenght - 1; i >= 0; i--) {
//			String ch=Character.toString(str.charAt(i));
//			str1 = str1 + ch;
			str1=str1+str.charAt(i);
			
			
		}
		if (str.equals(str1)) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}
}
