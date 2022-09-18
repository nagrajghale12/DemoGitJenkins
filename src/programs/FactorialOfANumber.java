package programs;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		
		int factorial = 1;
		for (int i=1;i<=n;i++) {//1,2,6,24,120
			factorial=factorial*i;
				}
		System.out.println("the factorial of "+n+" is "+factorial);
	}

}
//