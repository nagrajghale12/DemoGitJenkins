package starPatterns;

public class TheSolidRhombus {
	public static void main(String[] args) {
		int n=6;
		for (int i=1;i<n;i++) {
			for (int j=i;j<n;j++) {
				System.out.print(" ");
			}
			for (int  j=1;j<=n;j++) {
				System.out.print("*");
			}
			int space=2*(i-1);
			for (int j=0;j<space;j++) {
			System.out.print(" ");
			}
			for (int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1;i<=n;i++) {
			for (int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=n;j++) {
				System.out.print("*");
			}
			int space=2*(5-i)+1;
			for (int j=space;j>=0;j--) {
				
				System.out.print(" ");
			}
			for (int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
