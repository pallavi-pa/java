package day3;

public class min_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint a[]= {23,45,56,78};
		int a[]= {23,45,56,78};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}

}
