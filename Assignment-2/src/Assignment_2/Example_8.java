package Assignment_2;

public class Example_8 {
	static void exc(int a) {
		if(a<0||a>999) {
			throw new ArithmeticException("Invalid Employee ID");
		}
		else {
			System.out.println("Valid ID entered");
		}
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
			try {
			   exc(a);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}


}
