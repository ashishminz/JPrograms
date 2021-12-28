package jPrograms.Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Array_DuplicateElements {

	public static void main(String[] args) {
		
		
     String arr[] = {"JAVA","IS","A","PROGRAMMING","LANGUAGE","LANGUAGE","JAVA","IS"};
		
		
     Set<String> hset = new LinkedHashSet<String>(); 

		for(int i = 0;i<arr.length;i++ )
		{
			hset.add(arr[i]);
		}
		
		 
		for(String st:hset)
		{
			int count = 0;
		  for(int j = 0;j<arr.length;j++)
		  {
			if(st.equals(arr[j])) 
			{
				count++;
			}
		  }
		   
		  if(count > 1 )
		 System.out.println(st);
			
       }

}
}
