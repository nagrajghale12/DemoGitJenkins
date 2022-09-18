package programs;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
	Scanner s= new  Scanner (System.in);
	System.out.println("enter the number");
	int x=s.nextInt();
	
	
	int temp=0;
	 for (int i=2;i<x;i++) {
		 if(x%2==0) {
			 temp=1;
		 }
	 }
	 
	 if(x==0 || x==1) {
			System.out.println("prime numbers only start from 2");
		}
	 else if(temp==1) {
		 System.out.println("given no is not prime");
	 }
	 else {
		 System.out.println("given no is prime");
	 }
	
	
	}

}
