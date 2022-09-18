package programs;

import java.util.Scanner;

public class PrimeNumbers1ToN {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number upto which you want to find out prime numbers");
		int x=s.nextInt();
		
		System.out.println("prime numbers upto "+x+" are :");
		for (int i=1;i<=x;i++) {
			
			int count=0;
			for (int j=1;j<=i;j++) {
				if(i%j==0) count+=1;
			}
			if(count==2) System.out.print(i+" ");
		}
		
	}
}
