package jPrograms.Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Strings_RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String s = "JAVA IS A PROGRAMMING LANGUAGE";
		int length = s.length()-1;
		
	    Set<Character> hset = new LinkedHashSet<Character>();
	    for(int i = 0;i<length;i++)
	    {
	    	hset.add(s.charAt(i));
	    }
	     for (char ch : hset) {
	    	 if(ch!=' ')
			System.out.print(ch);
		}

	}

}
