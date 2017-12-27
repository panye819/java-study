package com._520it.day01._01_reflect;

public class App {

	public static void main(String[] args) {
		Mouse m = new Mouse();
		
		MotherBoard.install(m);
		System.out.println("---------------");
		MotherBoard.install(new IUSB() {

			@Override
			public void swapData() {
				// TODO Auto-generated method stub
				System.out.println("键盘在跃动。。。");
			}
			
		});
		
	}

}
