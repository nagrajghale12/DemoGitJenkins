package programs;

import java.util.Scanner;

public class FindEvenOdd {
	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		
		if(x%2==0) {
			System.out.println("the number is even");
			
		}
		else {
			System.out.println("the number is odd");
		}
	}

}
