package stringPrograms;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {
	public static void main(String[] args) {
		String str1="Edward Daniels";    //Rachel Solando
		String str2="Andrew Laeddis";    //Dolores Chanal
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
	    char [] String1=str1.toCharArray();
	    char [] String2=str2.toCharArray();
	    
	    Arrays.sort(String1);
	    Arrays.sort(String2);
	    
	    if(str1.length()!=str2.length()) System.out.println("not anagrams");
	    else if(Arrays.equals(String1, String2)) System.out.println("anagrams");
	    else System.out.println("not anagrams");
	    	
	}

}
