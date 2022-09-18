package arrayPrograms;

public class LargestNoByMethod {
	public static int LargestNo(int a[]) {
		int l=a.length;
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a[i] > a[j]) {
					int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		}
		return a[l-1];
	}
	public static void main(String[] args) {
		int a[]= {45,435,443,2,35,6};
		int b[]= {4,5,6,6,8,7};
		
		System.out.println("largest no is "+LargestNo(a));
		System.out.println("largest no in array b is "+LargestNo(b));
	}

}
