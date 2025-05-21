package cdc;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Helloworld";
		String s1="";
		String s2="";
		
		for (int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				s1=s1+ch;
			}
			else {
				s2=s2+ch;
			}
			
		}
		System.out.println(s1);

	}

}
