package programs;

import java.util.Scanner;

public class PalindromeFor {
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter a number to check whether it is a palindrome");
		int n=s.nextInt();
	
	int r; int sum=0; int temp=n;
	
	for (;n>0;n=n/10) {
		r=n%10;
		sum=(sum*10)+r;
	}
	
	if (temp==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	}
}
