package logicalProgramsPractice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a,b,c;
		a=0;b=1;
		System.out.print(a+" "+b);
		for (int i=1;i<=10;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
// 0 1 1 2 3 5 8
}
