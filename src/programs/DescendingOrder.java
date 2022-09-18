package programs;

import java.util.Scanner;

public class DescendingOrder {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number of elements you want in array");
		int n=s.nextInt();
		
		int arr[]= new int [n];
		System.out.println("enter all the elements in the array");
		
		for (int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(arr[i] < arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		
		System.out.println("the numbers in descending order ");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
