package programs;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		
		System.out.println("enter another number");
		int y=sc.nextInt();
		
		
		System.out.println("enter an operand");
	
		char button=sc.next().charAt(0);
	
	switch (button) {
	case '+':{ int c=x+y;
	System.out.println("sum is "+c);
	break;}
	
	case '-': {int c=x-y;
	System.out.println("the subtraction is "+c);
	break;}
	
	case '*': {
		int c=x*y;
		System.out.println("the multiplication is "+c);
		break;
		
	}
	case '/':{
		int c=x/y;
		System.out.println("division is "+c);
		break;
	}
	default:
		System.out.println("invalid input");
	
	}
	}

}
