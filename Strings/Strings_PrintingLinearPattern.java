package jPrograms.Strings;

public class Strings_PrintingLinearPattern {

	public static void main(String[] args) {
		
		
		String s = "abc" + "xyz";
		String resS = "";
		int n = s.length()/2;
		for(int i = 0 ;i<n;i++)
		{
			resS = resS + String.valueOf(s.charAt(i))+String.valueOf(s.charAt(n + i));
		}

		
		System.out.println(s);
		System.out.println(resS);
	}

}
