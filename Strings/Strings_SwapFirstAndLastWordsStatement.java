package jPrograms.Strings;

import java.util.LinkedList;
import java.util.List;

public class Strings_SwapFirstAndLastWordsStatement {

	public static void main(String[] args) {
		

		String s = "JAVA IS A PROGRAMMING LANGUAGE LANGUAGE PROGRAMMING";
		

		

		List<String> strSet = new LinkedList<String>();
		
	    String Str[] = s.split(" ");	
	
	    for(int j = 0;j<Str.length;j++)
		  {
	    	strSet.add(Str[j]);
		  }
	    
	    
		String tempStr = Str[0];
		Str[0] = Str[Str.length-1];
		Str[Str.length-1] = tempStr;
		
		for(int j = 0;j<Str.length;j++)
		  {
	    	System.out.print(Str[j]+" ");
		  }
		
		
	}

}
