package day8;
class Test5 extends Thread{
	public void run() {
		System.out.println("in test1 class");
	}
}
class Test6 extends Test5{
	public void run() {
		System.out.println("in test2 class");
	}
}
class Test3 implements Runnable{
	public void run() {
		System.out.println("in test3 class");
	}
}
class Test4 extends Test3{
	public void run() {
		System.out.println("in test4 class");
	}
}

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t2=new Test5();
		Test6 t1=new Test6();
		t2.start();
		t1.start();
		Test3 t3=new Test3();
		Thread p1=new Thread(t3);
		p1.start();
		Test4 t4=new Test4();
		Thread p2=new Thread(t4);
		p2.start();	

	}

}
