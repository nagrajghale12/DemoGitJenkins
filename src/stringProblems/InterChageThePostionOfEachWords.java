package stringProblems;

public class InterChageThePostionOfEachWords {

	public static void main(String[] args) {
	String s="Best of luck";
	String a[]=s.split(" ");
	int l= a.length;
	String rev="";
	
	for (int i=l-1;i>=0;i--) {
		rev+=a[i]+" ";
	}
	System.out.println(rev);
	}
}
