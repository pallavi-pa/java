package day3;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="helliworld";
		int n=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch=='l') {
				n++;
			}
		}
		System.out.println(n);

	}

}
