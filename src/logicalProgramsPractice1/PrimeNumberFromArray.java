package logicalProgramsPractice1;

public class PrimeNumberFromArray {
	
	public static void main(String[] args) {
		int a[]= {11,12,13,14,15,16,17,18,19};
			int l=a.length;

		for (int i=0;i<l;i++) {
			int count=0;
			for (int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count+=1;
				}
			}
			if(count==2) System.out.print(a[i]+" ");
		}
	}
}
