package arrayPrograms;

public class SmallestNoInArray {

	public static void main(String[] args) {
		int a []= {4534,6533,453,2545,63245,23445,3445,5445,5,344,34,2,564};
		int l= a.length;
		int min=a[0];
		
		for (int i=0;i<l;i++) {
			if (a[i] < min) {
				min=a[i];
			}
		}
		System.out.println("smallest no in this array is "+min);
	}
}
