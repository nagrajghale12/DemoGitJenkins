package arrayPrograms;

public class SecondLargestNo {
	public static int get2ndLargest(int a[],int l) {
	
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a[i] > a[j]) {             //2,3,4,5
					int temp=a[i];;
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		return a[l-2];
	}
	public static void main(String[] args) {
		
		int a[]= {453,634,456,754,457,755,876,457};
		int b[]= {44,56,86,65,87,43};
		
		System.out.println("second largest no is "+ get2ndLargest(a,8));
		System.out.println("second largest "+ get2ndLargest(b,6));
	}

}
