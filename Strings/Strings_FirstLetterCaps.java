package jPrograms.Strings;

public class Strings_FirstLetterCaps {

	public static void main(String[] args) {


		String s = "java is a programming language";
		
		String[] Str = s.split(" "); 
		
		
		for(int i = 0;i<Str.length;i++)
		{
			for(int j = 0;j<Str[i].length();j++)
			{
				char[] ch = Str[i].toCharArray();	
				if(j==0)
				{
					System.out.print(String.valueOf(ch[0]).toUpperCase());
				}
				else
			  System.out.print( ch[j]);
			   
			}
			System.out.print(" ");
		}
		
		

	}

}
