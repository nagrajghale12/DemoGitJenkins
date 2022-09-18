package logicalProgramsPractice;

public class SeperateEachCharFromString {

	public static void main(String[] args) {
		String s="Bangalore";
		int l=s.length();
		
		char a[]=s.toCharArray();
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<l;i++) {
			if(i==l-1) System.out.print(s.charAt(i));
			else System.out.print(s.charAt(i)+",");
		}
	}
}
