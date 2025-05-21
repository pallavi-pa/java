package day8;

public class multiple_threads implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		multiple_threads t1=new multiple_threads();
		multiple_threads t2=new multiple_threads();
		System.out.println("hello");
		Thread p1=new Thread(t1);
		Thread p2=new Thread(t2);
		p1.start();
		p2.start();
		

	}

}
