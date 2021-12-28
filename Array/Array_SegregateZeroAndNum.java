package jPrograms.Array;

public class Array_SegregateZeroAndNum {

	public static void main(String[] args) {


		int arr[] = {1,0,2,0,3,0,0,4};
		int resArr[] = new int[arr.length];
		
		int m = 1;
		int n =0;
		for(int i = 0;i<arr.length;i++ )
		{
			
			if(arr[i]==0)
			{
				resArr[arr.length-m] = arr[i];
				m++;
			}
			else
			{
				resArr[n] = arr[i];
				n++;
			}
			
		}
		

		for(int i = 0;i<resArr.length;i++ )
		{
			System.out.print(resArr[i]+" ");
		}
		
	}

}
