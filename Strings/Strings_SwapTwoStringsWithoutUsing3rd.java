package jPrograms.Strings;

public class Strings_SwapTwoStringsWithoutUsing3rd {

	public static void main(String[] args) {
		
		
		String s1 = "FirstString";
		String s2 = "SecondString";
		
        int l1 = s1.length();
        int l2 = s2.length();
        
	    s1 = s1+s2;
	    s2 = s2+s1;
	   
	    s1 = s1.substring(l1);
	    System.out.println(s1);
	    
	    s2 = s2.substring(l2, l2 + l1);
	    System.out.println(s2);
	    
	    
	    
	}

}
