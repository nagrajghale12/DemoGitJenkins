package programs;

import java.util.Scanner;

public class TableOfANumber {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number for which you want the table");
		int n=s.nextInt();
		
		//int table=1;
		System.out.println("the table of "+n+" is");
	for (int i=1;i<=10;i++) {
		//table=n*i;
		System.out.println(n*i);
	}
	
		
	}

}
