package jPrograms.Math;

import java.util.Scanner;

public class Maths_Factorial {

	public static void main(String[] args) {
		
		
        System.out.println("Enter a number : ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int fact = 1;
		int  count = 0;
		for(int i = 1;i<=n;i++)
		{
		  fact *= i;
		}
		
		System.out.println(fact);

	}

}
