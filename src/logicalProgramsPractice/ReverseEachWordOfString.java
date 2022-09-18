package logicalProgramsPractice;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String s = "public static void main";
		String rev = "";
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			String ss = "";
			if (s.charAt(i) == ' ') {
				for (int j = i - 1; j >= n; j--) {
					ss += s.charAt(j);
				}
				n += ss.length() + 1;
				rev += ss+" ";
			} 
			if (i == s.length() - 1) {
				for (int j = i; j >= n; j--) {
					ss += s.charAt(j);
				}
				rev += ss;
			}
		}
		System.out.println(rev);
		

	}

}
