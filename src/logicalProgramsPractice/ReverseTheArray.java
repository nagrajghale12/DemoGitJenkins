package logicalProgramsPractice;

public class ReverseTheArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int l=a.length;
		for (int i=0;i<l/2;i++) {
			int temp=a[i];
			a[i]=a[l-1-i];
			a[l-1-i]=temp;
		}
	
		for (int element:a) {
			System.out.print(element+" ");
		}
		
	}

}
