  package day6;


public class Exception_ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=Integer.parseInt(args[0]);
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}


	}

}
