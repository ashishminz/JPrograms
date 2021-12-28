package jPrograms.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Strings_OccurrenceOfCharacterString {

	public static void main(String[] args) {
		//create a set collection and add all the chararcters into the set so that the duplicates are removed
		//Compare all the characters of the set with the characters of the string
		//if matching increment the count
		//print both character of set and count
		
		String s = "JAVA IS A PROGRAMMING LANGUAGE";
		int length = s.length()-1;
		
	    Set<Character> hset = new LinkedHashSet<Character>();//1
	    for(int i = 0;i<length;i++)
	    {
	    	hset.add(s.charAt(i));
	    }
	
	    
		for(char c:hset)
		{
			int count = 0;
		  for(int j = 0;j<length;j++)
		  {
			if(c == s.charAt(j))//2  
			{
				count++;//3
			}
		  }
		   
		  System.out.println("Occurrences of "+c+" in the String is "+count);//4
			
		
		}
	}

}
