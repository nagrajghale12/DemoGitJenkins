package stringPrograms;

import java.util.Scanner;

public class CountNumberOfVowelsAndConsonents {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string value");
		String a=s.nextLine();
		
		a=a.toLowerCase();
		int count=0,vCount=0,cCount=0;
		for (int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
				vCount+=1;
			else if(a.charAt(i)>='a' && a.charAt(i)<='z')
				cCount+=1;
		}
		System.out.println("no of vowels are "+vCount);
		System.out.println("no of consonents are "+cCount);
	}

}
