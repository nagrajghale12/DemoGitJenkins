package arrayPrograms;

public class ArraysIncreasingOrder {

	public static void main(String[] args) {
		int a[]= {1,3,5,3,2,9,5,4,8,7};
		int l=a.length;
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++){
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int b:a) {
			System.out.print(b+" ");
		}
	}
}
