package logicalProgramsPractice1;

public class OddNumbersFromTheArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int l=a.length;
		
		for (int i=0;i<l;i++) {
			if(a[i]%2!=0) System.out.print(a[i]+" ");
		}
	}
}
