package arrayPrograms;

public class PrimeNoInArray {
	public static void main(String[] args) {
		int a[]= {11,12,13,14,15,16,17,18,19,20};
		
		System.out.println("the prime numbers in your array are ");
		for (int i=0;i<a.length;i++) {
			
			int count=0;
			for (int j=2;j<a[i];j++) {    //or for (int j=1;j<a[i];j++)
                 if (a[i]%j==0) {
                	 count+=1;
                 }
              
			}
			if (count ==0) System.out.println(a[i]);
		}
		
	}

}
