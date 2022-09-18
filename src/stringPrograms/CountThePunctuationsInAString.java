package stringPrograms;

import java.util.Scanner;

public class CountThePunctuationsInAString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string with punctuations");
		String a=s.nextLine();
		
		int count=0;
		for (int i=0;i<a.length();i++) {
			if(a.charAt(i)==','||a.charAt(i)=='.'||a.charAt(i)==';') count+=1;
			}
		System.out.println(count);
	}

}
