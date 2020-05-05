public class StringEquality {
    public static void main( String args[] ){
		String str1 = "Hello"; 
		String str2 = new String(str1); 
		String str3 = "Hello";
		String str4 = str2;
		if (str1 == str2) System.out.println("str1 == str2");
		else System.out.println("str1 != str2");
		if (str3.equals (str2)) System.out.println("str3 equals (str2)");
		else System.out.println("str3 does not equal (str2)");
		if (str1 == str3) System.out.println("str1 == str3");
		else System.out.println("str1 != str2");
		if (str4.equals (str1)) System.out.println("str4 equals (str1)");
		else System.out.println("str4 does not equal (str2)");
		if (str4 == str2) System.out.println("str4 == str2");
		else System.out.println("str4 != str2");
		if (str1.equals (str2)) System.out.println("str1 equals (str2)");
		else System.out.println("str1 does not equal (str2)");
	}
}
