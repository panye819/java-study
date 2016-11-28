package com.study.day24_Thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器：
 * 	可以让我们在指定的时间做某件事情，还可以重复的做某件事情
 * 	依赖Timer和TimerTask这两个类
 * 	Timer：定时
 *	TimerTask：任务
 */
class MyTask2 extends TimerTask{
	
	private Timer t;

	public MyTask2(){}
	public MyTask2(Timer t){
		this.t = t;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("嘣！！！！！爆炸了！！！！");
//		t.cancel();
	}
	
	
}
public class TimerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		//三秒后执行爆炸任务
//		t.schedule(new MyTask(), 3000);
//		t.schedule(new MyTask2(t), 3000);
		t.schedule(new MyTask2(), 3000, 2000);
		

	}

}
