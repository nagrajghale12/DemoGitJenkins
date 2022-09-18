package arrayPrograms;

public class DuplicateStringFromArray {
	
	public static void main(String[] args) {
		String a[]= {"Nagraj","Resh","Nagraj","Sandeep","Arati","Resh","Vikas"};
		int l=a.length;
		
		System.out.println("duplicate strings in array are");
		for (int i=0;i<l;i++) {
			for (int j=i+1;j<l;j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
				
	}

}
