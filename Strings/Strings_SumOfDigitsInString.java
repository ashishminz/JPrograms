package jPrograms.Strings;

public class Strings_SumOfDigitsInString {

	public static void main(String[] args) {
		
		
		String s = "145abc34%20";
		
		int sum = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			int n = (int)s.charAt(i);
			if(n>=48 && n<=57)
			{
		      		sum += n-48;
			}
		}
		
         System.out.println(sum);
        
	}

}
