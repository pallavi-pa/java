package day3;

public class array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,45,56,78,23};
		int a1[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
				}
			if (count==1) {
				a1[index++]=a[i];
			}
		}
		for(int i=0;i<index;i++) {
			System.out.print(a1[i]+" ");
		}
	}

}
