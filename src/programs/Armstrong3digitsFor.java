package programs;

import java.util.Scanner;

public class Armstrong3digitsFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a 3 digit number ");
		int n = s.nextInt();
		int r ; int arm=0;
		int temp=n;
	
		for (;n>0;n=n/10) {
			r=n%10;
			arm=(r*r*r)+arm;
		}
		if (temp==arm)
			System.out.println("armstrong");
		else 
			System.out.println("not an armstrong");
	}

}
