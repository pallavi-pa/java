
public class palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		char[] ch=str.toCharArray();
		String s2="";
		for(int i=str.length()-1;i>=0;i--) {
			s2+=ch[i];
		}
		System.out.println(s2);

	}

}
