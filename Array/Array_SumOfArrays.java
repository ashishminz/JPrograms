package jPrograms.Array;

public class Array_SumOfArrays {

	public static void main(String[] args) {


		int a[] = {1,2,3,4,6,7};
		int b[] = {1,2,3,4};
		
		int c = a.length;
		if(a.length<b.length)
		{
			c= b.length;
		}
		
		int resArr[] = new int[c];
		
		
		for(int i = 0;i<c;i++)
		{
			try {
			resArr[i] = a[i] + b[i];
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					resArr[i] = b[i];
				}
				else
					resArr[i] = a[i];
			}
		}
		
		
		for(int i = 0;i<resArr.length;i++ )
		{
			System.out.print(resArr[i]+" ");
		}

	}

}
