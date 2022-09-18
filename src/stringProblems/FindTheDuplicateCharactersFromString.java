package stringProblems;

import java.util.Set;
import java.util.TreeSet;

public class FindTheDuplicateCharactersFromString {

	public static void main(String[] args) {
		String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		
		TreeSet t= new TreeSet();
		for (int i=0;i<s.length();i++) {
			int count=0;
			for (int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) count+=1;
			}
			if(count>1) t.add(s.charAt(i));
		}
		System.out.println(t);
		
	}
}
