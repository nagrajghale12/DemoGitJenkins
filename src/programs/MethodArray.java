package programs;



public class MethodArray {
	
	public void ArrayDemo(String a[]) {
		for (int i=0;i<=3;i++) {
			System.out.println(a[i]);
		}
			
	}

	public static void main(String[] args) {
		String b[]= {"Nagraj","Resh","Sandeep","Arati"};
		MethodArray obj=new MethodArray();
		obj.ArrayDemo(b);
		
	}
}
