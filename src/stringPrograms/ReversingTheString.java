package stringPrograms;

import java.util.Scanner;

public class ReversingTheString {
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the string value that you want to reverse");
		String org=s.nextLine();
		String rev="";
		
		
		int l=org.length();
		for (int i=l-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println("string is reversed:");
		System.out.println(rev);
		
	}

}
