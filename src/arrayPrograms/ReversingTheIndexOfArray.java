package arrayPrograms;

public class ReversingTheIndexOfArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		int l=a.length;
		for (int i=0;i<l/2;i++) {
			int temp=a[i];
			a[i]=a[l-1-i];  //a[i]==a[l-1];
			a[l-1-i]=temp;
			//l--;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
