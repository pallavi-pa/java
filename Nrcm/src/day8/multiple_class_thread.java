package day8;
class Test1 extends Thread{
	public void run() {
		System.out.println("good morning");
	}
}
class Test2 extends Thread {
	public void run() {
		System.out.println("hello");
	}
}
public class multiple_class_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.start();
		t2.start();

	}

}
