package lesson42_thread;
/**
 * */

public class MyThread2 implements Runnable {

		private String name;
		
		public MyThread2(String name) {
			this.name = name;
		}
		
		public void run() {
			for(int i = 0;i<10;i++) {
				System.out.println("Thread运行："+name+", i = "+i);
			}
		}	

}
