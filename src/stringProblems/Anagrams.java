package stringProblems;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s1="Edward Daniels";
		String s2="Andrew Laeddis";
		s1=s1.replaceAll("\\s", "").toLowerCase();
		s2=s2.replaceAll("\\s", "").toLowerCase();
		char [] c1=s2.toCharArray();
		char [] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(s1.length()!=s2.length()) System.out.println("not anagrams ");
		else if(Arrays.equals(c1, c2)) System.out.println("angarams");
		else System.out.println("not anagrams");
	}
}
