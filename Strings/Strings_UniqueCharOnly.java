package jPrograms.Strings;


import java.util.LinkedHashSet;
import java.util.Set;

public class Strings_UniqueCharOnly {

	public static void main(String[] args) {
		
		
		String s = "JAVA IS A PROGRAMMING LANGUAGE";
		int length = s.length()-1;
		
	    Set<Character> hset = new LinkedHashSet<Character>();
	    for(int i = 0;i<length;i++)
	    {
	    	hset.add(s.charAt(i));
	    }
	    
		for(char c:hset)
		{
			
			int count = 0;
		  for(int j = 0;j<length;j++)
		  {
			if(c == s.charAt(j))  
			{
				count++;
			}
		  }
		  if(count==1)
	      System.out.print(c);	  
		  
		
	}


	}

}
