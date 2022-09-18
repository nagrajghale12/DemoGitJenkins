package programs;

import java.util.Scanner;

public class PalindromeNumbers1ToN {
	public static void main(String[] args) {
		for (int i=1;i<=500;i++){
			int n=i,rev=0,r;
			while  (n>0) {
				r=n%10;
				rev=(rev*10)+r;
				n/=10;
			}
			if (i==rev) System.out.println(i);
		}
	}
}
