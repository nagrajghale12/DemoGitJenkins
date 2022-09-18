package programs;

import java.util.Scanner;

public class StringPalindrome {
	
	public static void main(String[] args) {
		String org;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your string element");
		 org=s.nextLine();
		String rev="";
		
		int l= org.length();
		 
		for (int i=l-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		
		if (org.equals(rev)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
