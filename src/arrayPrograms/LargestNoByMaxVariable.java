package arrayPrograms;

import java.util.Scanner;

public class LargestNoByMaxVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("enter the no of elements you want in your array");
		int n=s.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the elements in your array");
		
		for(int i=0;i<n;i++) {
		      a[i]=s.nextInt();
		}
		
		int max=a[0];
		for (int i=0;i<n;i++) {
			if (a[i] > max) {
				max=a[i];
			}
		}
		System.out.println("the largest no in your array is "+max);
		
		
	}
}
