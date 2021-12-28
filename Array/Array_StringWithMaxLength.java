package jPrograms.Array;

public class Array_StringWithMaxLength {

	public static void main(String[] args) {
		
		
		String arr[] = {"JAVA","IS","A","PROGRAM","WELCOME"};
		
		
		for(int i = 0;i<arr.length;i++ )
		{
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i].length() == arr[arr.length-1].length())
		System.out.println(arr[i]);
		}
	}

}
