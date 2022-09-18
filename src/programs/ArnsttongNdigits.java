package programs;

import java.util.Scanner;

public class ArnsttongNdigits {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a number to check whether it is an armstrong number:");
		int n=s.nextInt();
		
		int temp,digit,digitpower,arm=0,x=0;
		for(temp=n;temp>=1;temp/=10) {
			x+=1;
		}
		for (temp=n;temp>=1;temp/=10) {
			digit=temp%10;       //0,7,3  //4,3,6,1
			
			digitpower=1;
			for(int i=1;i<=x;i++) { 
				digitpower*=digit;  //0,343,27   //256,81,1296,1
				
			}
			arm+=digitpower; //0,343,370  //256,337,1633,1634
		}
		if (n==arm) System.out.println("it is an armstrong number");
		else System.out.println("it is not an armstrong number");
	}

}
