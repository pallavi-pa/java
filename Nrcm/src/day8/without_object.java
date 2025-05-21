package day8;

public class without_object implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new without_object ());
		t.start();

	}

}
