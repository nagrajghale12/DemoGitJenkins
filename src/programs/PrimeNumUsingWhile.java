package programs;


import java.util.Scanner;

public class PrimeNumUsingWhile {

	public void FindPrimeOrNot() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int x=sc.nextInt();
		
		int temp=0;
		
		int i=2;
		while(i<x) {
			i++;
			if(x%i==0) {
				temp=1;
			}
		}
		if(x==0 || x==1) {
			System.out.println("prime numbers start from 2");
		}
		else if (temp>=1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}
	public static void main(String[] args) {
		 PrimeNumUsingWhile obj=new  PrimeNumUsingWhile();
		 obj.FindPrimeOrNot();
		
	}
}
