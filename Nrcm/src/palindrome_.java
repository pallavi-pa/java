
public class palindrome_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mam";
		String s1="";
		for (int i=str.length()-1;i>=0;i--) {
			s1+=str.charAt(i);
		}
		if(s1.equals(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
