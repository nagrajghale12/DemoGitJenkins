package programs;

import java.util.Scanner;

public class PalindromeByString {
	
	public static void main(String[] args) {
		
		String original,reverse= "";
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number to check whether it is a palindrome");
	    original=s.nextLine();
	    
	    int l = original.length();
	    for (int i=l-1;i>=0;i--) {
	    	reverse= reverse+original.charAt(i);
	    }
	    
	    if(original.equals(reverse)) {
	    	System.out.println("the number is a palindrome ");
	    }
	    else {
	    	System.out.println("the number is not a panlindrome");
	    }
	    
	}
	
}
