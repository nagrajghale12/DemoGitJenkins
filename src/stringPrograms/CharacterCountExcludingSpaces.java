package stringPrograms;

import java.util.Scanner;

public class CharacterCountExcludingSpaces{
	public static void main(String[] args) {
	String s="The only sensible way to live in this world is without the rules";
	int l= s.length();
	int count=0;
	for (int i=0;i<l;i++) {
		if(s.charAt(i)!=' ')
			count+=1;
	}
	System.out.println(count);
	}
}
