package jPrograms.Strings;

public class Strings_RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		
		String s = "Hello^H588ow!are$your@1233stud80ies$going_Is#it%good?";
		
		String alphabet = "";
		String number = "";
		String special = "";
	
		for(int i = 0;i<s.length();i++)
		{
			
			int n = (int)s.charAt(i);
			if((n>=65 && n<=90) || (n>=97 && n<=122))
			{
				alphabet += s.charAt(i);
					
			}
			else if((n>=48 && n<=57)) {
				number += s.charAt(i);
			}
			else
			{
				special += s.charAt(i);
			}
		}
		
		System.out.println(alphabet+"   "+number+"    "+special);

	}

}
