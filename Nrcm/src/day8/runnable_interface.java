package day8;

public class runnable_interface implements Runnable{
	public void run() {
		System.out.println("hi");
	}


	public static void main(String[] args) {
		runnable_interface  t1=new  runnable_interface ();
		Thread t2=new Thread(t1);
		 System.out.println("hello");
		 t2.start();
	}
}
