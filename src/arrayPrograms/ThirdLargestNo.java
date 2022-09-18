package arrayPrograms;

public class ThirdLargestNo {
	
	public static int get3rdLargestNo(int a[],int l) {
		 l = a.length;
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if (a[i] > a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[l-3];
	}
	public static void main(String[] args) {
		int a[]= {45,76,53,77,44,78,23};
		int b[]= {3,4,5,6,7,8};
		System.out.println("3rd largest "+get3rdLargestNo(a,7));
		System.out.println("3rd largest "+get3rdLargestNo(b,6));
	}

}
