package stringProblems;

public class ReverseEachWordOfTheString {

	public static void main(String[] args) {
		String s="Royale with cheese";
		String a[] =s.split(" ");
		String rev="";
		
		for (int i=0;i<a.length;i++) {
			String rword="";
			for (int j=a[i].length()-1;j>=0;j--) {
				rword+=a[i].charAt(j);
			}
			rev+=rword+" ";
		}
		System.out.println(rev);
	}
}
