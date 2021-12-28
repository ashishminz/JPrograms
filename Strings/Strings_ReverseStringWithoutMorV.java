package jPrograms.Strings;

public class Strings_ReverseStringWithoutMorV {

	public static void main(String[] args) {
		
		String s = "JAVA";
		String s1 = "";
		
		char[] ch = s.toCharArray();
		int count = 0;
		
		//for each used because it does not require the length of the string
		for (char c : ch) {
		  count++;
		 }
		
        int length = count-1;
		
		for(int i = 0;i<=length;i++)
		{
			s1 = s1 + s.charAt(length-i);
		}

		System.out.print(s1);
	
	}
}


