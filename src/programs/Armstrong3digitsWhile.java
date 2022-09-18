package programs;

import java.util.Scanner;

public class Armstrong3digitsWhile {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to check whether it is an armstrong number");
		int n=s.nextInt();
		int r;int  arm=0; 
		int temp=n;
		while (n>0) {
			r=n%10;        // 0,7,3
			arm=(r*r*r)+arm; //0,0+343,343+27
			n=n/10;          //37,7
		}
		if (temp==arm)
			System.out.println("armstrong");
		else 
			System.out.println("not armstrong");
	}

}
