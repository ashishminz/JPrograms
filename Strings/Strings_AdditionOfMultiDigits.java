package jPrograms.Strings;

import java.util.LinkedList;
import java.util.List;

public class Strings_AdditionOfMultiDigits {

	public static void main(String[] args) {
		

		String s = "145abc3xy20";
	

		
		int tsum = 0;
		int sum = 0;
		
		for(int i = 0;i<s.length();i++)
		{
			
		
			int n = (int)s.charAt(i);
			if(n>=48 && n<=57)
			{
			  sum =  sum*10 + (n-48) ; 
			}
			else
			{
				tsum = sum + tsum;
				sum = 0;
				
			}
			
			
			
		}
		tsum = tsum+ sum;
		System.out.println(tsum);
		
	}

}
