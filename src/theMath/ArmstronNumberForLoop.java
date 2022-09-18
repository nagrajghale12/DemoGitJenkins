package theMath;

import java.util.Scanner;

public class ArmstronNumberForLoop {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a 3 digit number to check whether it is an armstron number");
		int n=s.nextInt();
		
		int arm=0,d;
		for (int temp=n;temp>0;temp/=10) {
			d=temp%10;
			arm=(d*d*d)+arm;
		}
		if (n==arm) System.out.println(n+" is an armstrong number");
		else System.out.println(n+" is not an armstrong number");
	}

}
