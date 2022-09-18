package theMath;

import java.util.Scanner;

public class PrimeNumbersUptoN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number upto which you want to print the prime numbers");
		int n=s.nextInt();
		
//		for (int i=2;i<=n;i++) {
//			
//			int count=0;
//			for (int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count+=1;
//				}
//			}
//		
//			if(count==2) System.out.print(i+" ");
//		}
//		
		for (int i=2;i<=n;i++) {
			
			int count=0;
			for (int j=2;j<i;j++) {
				if(i%j==0) count+=1;
			}
			if(count==0) System.out.print(i+" ");
		}
	}

}
