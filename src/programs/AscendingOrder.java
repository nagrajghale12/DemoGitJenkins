package programs;

import java.util.Scanner;

public class AscendingOrder {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		System.out.println("enter the number of elements you want to store in the array: ");
		int n=s.nextInt();
		
		System.out.println("enter all the elements");
		int arr[]= new int [n];
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if (arr[i] > arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("the ascending order of the numbers is");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
			
		}
		
	}

}
