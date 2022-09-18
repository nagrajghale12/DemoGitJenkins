package logicalProgramsPractice1;

public class ArmstrongFromArray {

	public static void main(String[] args) {

		int []a= {234,653,545,370,254,371,153};
		int l=a.length;
		
		for (int i=0;i<l;i++) {
			int arm=0,d,temp=a[i];
			while(temp>0) {
				d=temp%10;
				arm=(d*d*d)+arm;
				temp/=10;
			}
			if(a[i]==arm) System.out.println(a[i]);
		}
	}
}
