package com._520it.day01._01_reflect;

public class MotherBoard{

	public static void install(IUSB usb) {
		System.out.println("安装"+usb.getClass().getSimpleName());
		usb.swapData();
	}

}
