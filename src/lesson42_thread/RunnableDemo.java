package lesson42_thread;
/**
 * */


public class RunnableDemo {
	public static void main(String[] args) {
		MyThread2 m1 = new MyThread2("线程C");
		MyThread2 m2 = new MyThread2("线程D");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		System.out.println("----------");
		t1.start();
		t2.start();
		
	}

}
