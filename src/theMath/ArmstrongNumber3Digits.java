package theMath;

import java.util.Scanner;

public class ArmstrongNumber3Digits {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a 3 digit number to check whether it is an armstrong number");
		int n=s.nextInt();
		
		int arm=0,d,temp=n;
		while(n>0) {
			d=n%10;
			arm=(d*d*d)+arm;
			n/=10;
		}
		if (temp==arm) System.out.println(temp+" is an armstrong number");
		else System.out.println(temp+" is not an armstrong number");
	}
	

}
