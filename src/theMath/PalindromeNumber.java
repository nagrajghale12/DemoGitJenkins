package theMath;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter a number to check whether it is a palindrome number");
		int n= s.nextInt();
		
		int rev=0,d,temp=n;
		while(n>0) {
			d=n%10;
			rev=(rev*10)+d;
			n/=10;
		}
		if (temp==rev) System.out.println(temp+" is a palindrome");
		else System.out.println(temp+ " is not a palindrome");
	}

}
