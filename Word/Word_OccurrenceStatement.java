package jPrograms.Word;

import java.util.LinkedHashSet;
import java.util.Set;

public class Word_OccurrenceStatement {

	public static Set<String> getSetString(String s)
	{
		int lengthStr = s.length()-1;
		Set<String> strSet = new LinkedHashSet<String>();
		
		
		int n = 0,start = 0;
		
		
			for(int i = 0;i<lengthStr;i++)
			{
				char ch = s.charAt(start);
				String Str = "";
					while(ch!=' ') 
					 {
						 Str = Str + ch;
						 if(start >= lengthStr)
							 break;
						 else
						    ch = s.charAt(start);
					  start++;
				     }
				strSet.add(Str.trim());
				
			}
		return strSet;
		
	}
	
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
		   
		  System.out.println("Occurrences of "+c+" in the statement is "+count);//4
		
		
		}

	}

}
