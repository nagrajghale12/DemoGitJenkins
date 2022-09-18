package theMath;

import java.util.Scanner;

public class ArmstrongNumber4Digits {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a 4 digit number to check whether it is an armstrong number");
		int n=s.nextInt();
		
		int temp=n,arm=0,d;
		while(n>0) {
			d=n%10;
			arm=(d*d*d*d)+arm;
			n/=10;
		}
		if (temp==arm) System.out.println(temp+ " is an armstrong number");
		else System.out.println(temp+" is not an armstrong number");
	}

}
