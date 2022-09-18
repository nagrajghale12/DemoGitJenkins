package programs;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		
		int sum=0;
		for (int i=1;i<=n;i++) {//1,3,6,10,15
			sum=sum+i;
		}
		System.out.println("the sum of first "+n+" numbers is "+sum);
		
	}

}
