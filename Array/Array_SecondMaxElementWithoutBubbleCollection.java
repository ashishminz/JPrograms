package jPrograms.Array;

public class Array_SecondMaxElementWithoutBubbleCollection {

	public static void main(String[] args) {
		
		
		int arr[] = {12,56,35,13,78,67,5,9,11};
		
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++)
		{
			
			if(max < arr[i])
			{
				max = arr[i]; 
			}
		}
		
		
		int secondmax = arr[0];
		for(int i = 1;i<arr.length;i++)
		{
			if(secondmax<max)
			{
			if( secondmax < arr[i])
			{
				secondmax = arr[i]; 
			}
			}else
			{
				continue;
			}
		}
		System.out.println(secondmax);

	}

}
