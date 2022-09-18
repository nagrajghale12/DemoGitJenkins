package theMath;

import java.util.Scanner;

public class ArmStrongNumberNDigits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to check whether it is an armstron number");
		int n=s.nextInt();
		
		int digit,temp,digitpower,x=0,arm=0;
		for (temp=n;temp>=1;temp/=10) {
			x+=1;
		}
		
		for (temp=n;temp>=1;temp/=10) {
			digit=temp%10;
			
			digitpower=1;
			for (int i=1;i<=x;i++) {
				digitpower*=digit;
			}
			arm+=digitpower;
		}
		if(n==arm) System.out.println(n+" is an armstrong number");
		else System.out.println(n+" is not an armstrong number");
	}

}
