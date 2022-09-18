package arrayPrograms;

public class CharacterCountOfEachString {

	public static void main(String[] args) {
		String a[]= {"Nagaraj","Resh","Sandeep","Arati"};
		int l=a.length;
		
		for(int i=0;i<l;i++) {
			int n=a[i].length();
			System.out.println(a[i]+" has "+  n+" letters");
			
		}
	}
}
