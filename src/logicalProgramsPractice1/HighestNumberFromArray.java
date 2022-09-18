package logicalProgramsPractice1;

public class HighestNumberFromArray {
	public static void main(String[] args) {
		int a[]= {23,43,3234,3423,432323,32123,12,323,123};
		int l=a.length;
		
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[l-1]);
	}

}
