package arrayPrograms;

public class StringToChar {
	public static void main(String[] args) {
		String s ="Velocity";
		
		int l = s.length();
		
		//for (int i=0;i<l;i++) {
			//System.out.print(s.charAt(i)+",");
			char a[]=s.toCharArray();
			System.out.println(a[0]);
		//}
	}

}
