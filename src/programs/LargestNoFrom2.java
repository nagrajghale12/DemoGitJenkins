package programs;

import java.util.Scanner;

public class LargestNoFrom2 {
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		if (n1>n2)
			System.out.println(n1+ " is larger than "+n2);
		else
			System.out.println(n2 + " is larger than "+n1);
	}
}
