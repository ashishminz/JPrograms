package jPrograms.Array;

public class Array_SumOfFirstThreeMin {

	public static void main(String[] args) {
		
		

int arr[] = {12,56,35,13,78,67,5,9,11};
		
		for(int i = 0;i<arr.length;i++ )
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for(int i = 0;i<3;i++ )
		{
			sum += arr[i];
		}
		System.out.println(sum);


	}

}
