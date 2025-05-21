package day7;
public class throws_user_method {
	static void add(int a,int b) {
		if(b==0) {
			throw new ArithmeticException("maths radha niku");
		}
		int c=a/b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(20,0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("all keywords covered");
		}

	}

}
