package jPrograms.Math;

public class Maths_SumOfDigits {

	public static void main(String[] args) {
		
		
		int N = 7171;
		int sum = 0;
		
		while(N>0)
		{
			int a = N%10;
			int b = N/10;
			sum +=a;
			N = b;
			
		}
      System.out.println(sum);
	}

}
