package demoPackage;

public class ReverseString {

	public static String stringReverse(String str) {

		int strlen = str.length();
		for (int i = strlen-1 ; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}
		return str;

	}

	public static void main(String[] args) {
		String Str = "This is devakee";
		String value =stringReverse(Str);
		System.out.print("Reverse String is "+value);

	}

}
