package jPrograms.Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maths_FibbionacciSeries {
	
	

	public static void main(String[] args) {
		
		
        System.out.println("Enter a number upto which fibbonacci series is required : ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		int num1 = 0;
		int num2 = 1;
		int num3 ;
		
		List<Integer> fseries = new ArrayList<Integer>();
		fseries.add(0, 0);
		fseries.add(1, 1);
		
		for(int i = 2;i<n;i++)
		{
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			fseries.add(i,num3);
		}
		
		System.out.println(fseries);
	}

}
