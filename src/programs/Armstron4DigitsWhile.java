package programs;

import java.util.Scanner;

public class Armstron4DigitsWhile {
	
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
	    System.out.println("enter a 4 digit number");
	    int n = s.nextInt();
	    int r; int arm=0; 
	    int temp=n;
	    while (n>0) {
	    	r=n%10;
	    	arm=(r*r*r*r)+arm;
	    	n=n/10;
	    }
	    if (temp==arm)
	    	System.out.println("armstrong number");
	    else 
	    	System.out.println("not an arstrong number");
	}

}
