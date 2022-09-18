package theMath;

import java.util.Scanner;

public class PalindromeByString {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter your string element to check whether it is a palindrome");
		String org=s.nextLine();
		String rev="";
		
		int l=org.length();
		for (int i=l-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev)) System.out.println("it is a palindrome");
		else System.out.println("not a palindrome");
	}

}
