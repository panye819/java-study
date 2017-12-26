package lesson42_thread;
/**
 * */


public class ThreadDemo {
	public static void main(String[] args) {
		MyThread m1 = new MyThread("线程A");
		MyThread m2 = new MyThread("线程B");
//		
//		m1.run();
//		m2.run();
		System.out.println("----------");
		m1.start();
		m2.start();
		
	}

}
