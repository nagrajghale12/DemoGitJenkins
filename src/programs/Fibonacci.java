package programs;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int n3;
		
		for (int i=1;i<=10;i++) {
			n3=n1+n2;
			
			System.out.print(n1+" ");
			n1=n2;
			n2=n3;
		}
		
	}

}
// 0,1,2,3,5,8,13,21,34