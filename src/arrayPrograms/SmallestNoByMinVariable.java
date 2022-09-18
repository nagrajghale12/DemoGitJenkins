package arrayPrograms;

import java.util.Scanner;

public class SmallestNoByMinVariable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no of elements you want in your array");
		int n=s.nextInt();
		
		int a[]=new int [n];
		System.out.println("enter the element you want to store in your array");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		int min= a[0];
		for (int i=0;i<n;i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("the smallest no in your array is "+min);
	}

}
