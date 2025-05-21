package day3;

public class string_comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="prince";
		String s2="prince";
		String s3=new String("queen");
		String s4=new String("queen");
		System.out.println(s1.equals(s2 ));
		System.out.println(s1.equals(s3 ));
		System.out.println(s1.equals(s4));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		

	}

}
