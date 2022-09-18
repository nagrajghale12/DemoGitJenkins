package arrayPrograms;

public class LargestNoInArray {
	
	public static void main(String[] args) {
		int a[]= {343,455,456,676,37,8,67,5,65764,3566,4545,4634};
		int l = a.length;
		int max= a[0];
		
		for (int i=0;i<l;i++) {
			if (a[i] > max) {
				max=a[i];
			}
		}
		System.out.println("the largest no in this array is "+max);
	}

}
