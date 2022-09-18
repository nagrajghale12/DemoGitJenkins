package logicalProgramsPractice;

public class Palindrome {
	public static void main(String[] args) {
		int n=123;
		int temp=n,d,rev=0;
		while(n>0) {
			d=n%10; //3,2,1
			rev=(rev*10)+d; //3,32,321
			n/=10;
		}
		if (temp==rev) System.out.println("it's a palindrome no");
		else System.out.println("not a palindrome");
	}

}
