package logicalProgramsPractice1;

public class PalindromeFromArray {
	public static void main(String[] args) {
		int a[]= {123,121,134,345,232,565,644};
		int l=a.length;
	
		for (int i=0;i<l;i++) {
			int rev=0,temp=a[i];
			while(temp>0) {
				rev=(rev*10)+temp%10;
				temp/=10;
			}
			if(a[i]==rev) System.out.print(a[i]+" ");
		}
	}

}
