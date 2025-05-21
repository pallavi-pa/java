
package day3;

public class max_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,56,78};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);


	}

}
