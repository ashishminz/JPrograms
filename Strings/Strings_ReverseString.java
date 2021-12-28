package jPrograms.Strings;

public class Strings_ReverseString {

	public static void main(String[] args) {
		
		
		String s = "JAVA";
		int length = s.length()-1;
		
		for(int i = 0;i<=length;i++)
		{
			System.out.print(s.charAt(length-i));
		}

	}

}
