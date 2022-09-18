package programs;

import java.util.Scanner;

public class FactorialOfAllNumbersInAnArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements you want in your array");
		int n=s.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the elements in your array");
		
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		

	
		for (int i=0;i<a.length;i++) {
			
			int fact=1;
			for (int j=a[i];j>0;j--){
					fact=fact*j;
		}
			System.out.println("factorial of "+a[i]+" is "+fact);
	}
	}
}
