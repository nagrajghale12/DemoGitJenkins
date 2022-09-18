package logicalProgramsPractice1;

public class ReverseTheArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int l=a.length;
		
		for (int i=0;i<l/2;i++) {
			int t=a[i];
			a[i]=a[l-1-i];
			a[l-1-i]=t;
		}
		for (int e:a) {
			System.out.print(e+" ");
		}
	}

}
