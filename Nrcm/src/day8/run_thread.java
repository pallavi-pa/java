package day8;

public class run_thread extends Thread{
	public void run() {
		System.out.println("hi");
	}


	public static void main(String[] args) {
		 run_thread t1=new  run_thread();
		 System.out.println("hello");
		 t1.start();
	}

}
