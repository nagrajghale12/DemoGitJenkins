package arrayPrograms;

public class DuplicateNoFromNumber {
	public static void main(String[] args) {

	int a[]= {2,3,4,3,6,5,2,4,7,5,8};
	int l=a.length;
	
	System.out.println("the duplicate elements in your array are");
	for (int i=0;i<l;i++) {
		for (int j=i+1;j<l;j++) {
			if(a[i] == a[j]) {
				System.out.println(a[j]);
			}
		}
	}
	}
}
