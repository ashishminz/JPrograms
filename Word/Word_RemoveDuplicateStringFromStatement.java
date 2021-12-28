package jPrograms.Word;

import java.util.LinkedHashSet;
import java.util.Set;

public class Word_RemoveDuplicateStringFromStatement {

	public static void main(String[] args) {
		
		
        String s = "OF ALL KNOWN LANGUAGE JAVA IS THE ONLY PROGRAMMING IS LANGUAGE WHICH IS KNOWN ALL OVER THE WORLD";
		
		Set<String> strSet = new LinkedHashSet<String>();
		
	    String Str[] = s.split(" ");	
	
	    for(int j = 0;j<Str.length;j++)
		  {
	    	strSet.add(Str[j]);
		  }
		
		for(String c:strSet)
		{
			int count = 0;
		  for(int j = 0;j<Str.length-1;j++)
		  {
			if(c.equals(Str[j]))  
			{
				count++;
			}
		  }
		   if(count==1)
		  System.out.println("Occurrences of "+c+" in the statement is "+count);//4
		   else
			   continue;
		
		}

	}

}
