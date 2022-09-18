package programs;

import java.util.Scanner;

public class PrimeArchana {

	public static void main(String[] args) {
		
	Scanner s= new Scanner (System.in);
			System.out.println("enter a number to check whether it is prime number");
		int n=s.nextInt();
		
		
		int count=0 ;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
			count+=1;
			}
			
		}
		if (count==0) {
			System.out.println("the number is  prime");
		}
		
		else {System.out.println("number is not prime");}
//		if (n==1 || n==0) {
//			System.out.println("prime numbers start with 2");
//		}
//		else if (count == 2) {
//			System.out.println("prime");
//		}
//		else {
//			System.out.println("not a prime");
//		}
	}
}
