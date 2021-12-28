package jPrograms.Strings;

import java.util.LinkedHashSet;
import java.util.LinkedList;

import java.util.Set;

public class Strings_PositionofLatestCharType {

	public static void main(String[] args) {


		String s = "tester";
		int length = s.length();
		
	    Set<Character> hset = new LinkedHashSet<Character>();//1
	    for(int i = 0;i<length;i++)
	    {
	    	hset.add(s.charAt(i));
	    }

	    //traverse from behind
		for(char c:hset)
		{
			
		  for(int j = length-1;j>=0;j--)
		  {
			if(c == s.charAt(j))//2  
			{
				 System.out.println("Latest Position of "+c+" in the String is "+(j+1));//4
				 break;
			}
		  }
		   
		 
			
		
		}

	}

}
