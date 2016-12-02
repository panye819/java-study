package com.study.day24_02_Pattern;

import java.io.IOException;

/**
 *	Runtime：
 *		每个Java对象都有一个Runtime类实例，使应用程序能够与其运行的环境相连接
 *
 *
 */
public class RuntimeDemo {
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
//		rt.exec("msconfig");
		rt.exec("notepad");
	}
}
