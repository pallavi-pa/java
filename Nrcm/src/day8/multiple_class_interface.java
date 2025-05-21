package day8;
class Sample1 extends Thread{
	public void run() {
		System.out.println("in Sample1 class");
}
}
class Sample2 implements Runnable{
	public void run() {
		System.out.println("in Sample2 class");
}
}
public class multiple_class_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 s1=new Sample1();
		s1.start();
		Sample2 s2=new Sample2();
		Thread t1=new Thread(s2);
		t1.start();
		

	}

}
