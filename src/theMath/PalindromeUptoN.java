package theMath;

import java.util.Scanner;

public class PalindromeUptoN {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a number upto which you want to print the palindrome numbers");
	    int m=s.nextInt();
	    
	    for (int i=1;i<=m;i++) {
	    	int rev=0,d,n=i;
	    	while (n>0) {
	    		rev=(rev*10)+n%10;
	    		n/=10;
	    	}
	    	if (i==rev) System.out.println(i+" ");
	    }
	}

}
