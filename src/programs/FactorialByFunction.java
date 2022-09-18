package programs;

import java.util.Scanner;

public class FactorialByFunction {
	
	public static int findFactorial(int n) {
		
		int fact=1;
		for (int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number of which you want the factorial");
		int n=s.nextInt();
		
		System.out.println("factorial of "+n+" is "+findFactorial(n));
	}

}
