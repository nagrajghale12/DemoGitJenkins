package stringProblems;

import java.util.HashMap;

public class NoOfOccurenceOfEachChar {

	public static void main(String[] args) {
		String s="Royale with cheese";
		s=s.replaceAll("\\s", "").toLowerCase();
		
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for (int i=0;i<s.length();i++) {
			int count=0;
			for (int j=0;j<s.length();j++) {
				if (s.charAt(i)==s.charAt(j)) count+=1;
			}
			if(s.charAt(i)!=' ') h.put(s.charAt(i), count);
		}
		System.out.println(h);
	}
}
