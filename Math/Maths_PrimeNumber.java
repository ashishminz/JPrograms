package jPrograms.Math;

import java.util.Scanner;

public class Maths_PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int  count = 0;
		for(int i = 1;i<=n/2;i++)
		{
		  if(n%i==0)
			  count++;
		}
		
		System.out.println(count);
		if(count>1)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}

	}

}
