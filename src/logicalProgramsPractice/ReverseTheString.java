package logicalProgramsPractice;

public class ReverseTheString {
	public static void main(String[] args) {
		String org="Archana";
		String rev="";
		System.out.println(rev);
		
		for (int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
