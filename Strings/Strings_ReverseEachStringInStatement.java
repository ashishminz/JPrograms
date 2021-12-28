package jPrograms.Strings;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Strings_ReverseEachStringInStatement {

	public static void main(String[] args) {
		
		
		String s = "JAVA IS A PROGRAMMING LANGUAGE LANGUAGE PROGRAMMING";
		

		

		List<String> strSet = new LinkedList<String>();
		
	    String Str[] = s.split(" ");	
	
	    for(int j = 0;j<Str.length;j++)
		  {
	    	strSet.add(Str[j]);
	    	
		  }
		
	    
	   for (String st : strSet) {
		   
		   char[] ch = st.toCharArray();
		   int chLen = ch.length-1; 
		   for(int i = 0;i<=chLen;i++)
		   {
			   System.out.print(ch[chLen-i]);
		   }
		   System.out.print(" ");
		
	}
       
	    
	}

}
