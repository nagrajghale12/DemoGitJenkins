package theMath;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number to check whether it is prime number");
		int n=s.nextInt();
		
//		int count=0;
//		for (int i=2;i<n;i++) {
//			if(n%i==0)
//			count+=1;
//		}
//		if (n==0 || n==1) System.out.println("prime number starts from 2");
//		else if(count==0) System.out.println("prime  number");
//		else System.out.println("not a prime number");
		
		int count=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0)
				count+=1;
		}
		if(count==2) System.out.println("prime number");
		else if (n==1 || n==0) System.out.println("prime numbers start from 2");
		else System.out.println("not a prime number");
	}

}
