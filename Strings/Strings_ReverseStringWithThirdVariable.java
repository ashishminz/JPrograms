package jPrograms.Strings;

public class Strings_ReverseStringWithThirdVariable {

	public static void main(String[] args) {
		
		
		String s = "JAVA";
		String s1 = "";
		int length = s.length()-1;
		
		for(int i = 0;i<=length;i++)
		{
			s1 = s1 + s.charAt(length-i);
		}

		System.out.print(s1);
	}

}
