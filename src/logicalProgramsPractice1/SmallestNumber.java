package logicalProgramsPractice1;

public class SmallestNumber {

public static void main(String[] args) {
	int a[]= {2,45,334,234,42,34,43,45};
    int l=a.length;
    for (int i=0;i<l;i++) {
    	for (int j=i+1;j<l;j++) {
    		if(a[i]<a[j]) {
    			int t=a[i];
    			a[i]=a[j];
    			a[j]=t;
    		}
    	}
    }
    System.out.println(a[l-1]);
}
	
}
