package day8;

public class Runnable_with_Anynomous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("hi");
			}
		};
		Runnable r2=new Runnable() {
		public void run() {
			System.out.println("objects cannout be created for interfaces");
		}
	};
	Thread t1=new Thread(r1);
	t1.start();
	Thread t2=new Thread(r2);
	t2.start();

	}

}
