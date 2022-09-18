package arrayPrograms;

public class FindPrimeNoInArray {
	public static void main(String[] args) {
		int a [] = {11,12,13,14,15,16,17,18};
		int l=a.length;
		int count;
		System.out.println("the prime numbers in the array is ");

		for (int i=0;i<l;i++) {
			count =0;
			for (int j=1;j<=a[i];j++) {
				if (a[i]%j==0) {
					count+=1;
				}
			}
			if(count == 2 ) {
				System.out.println(a[i]);
			}
		}
		
		}
	
}

