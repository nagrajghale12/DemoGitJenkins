package logicalProgramsPractice1;

public class SortArrayInAsc {

	public static void main(String[] args) {
		int a[]= {23,34,23,4,5,3,32,2343,534,342,343};
		int l=a.length;
		for(int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i=0;i<l;i++) {
			System.out.print(a[i]+" ");
			}
	}
}
