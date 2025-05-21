package day8;

public class daemon_thread extends Thread {
	String s;
	public daemon_thread(String name) {
		s=name;
	}
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(s+"is a daemon thread");
		}
		else {
			System.out.println(s +"is User Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		daemon_thread  thread1=new daemon_thread ("thread1");
		daemon_thread  thread2=new daemon_thread ("thread2");
		daemon_thread  thread3=new daemon_thread ("thread3");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.setDaemon(false);
		thread3.start();
		
        
	}

}
