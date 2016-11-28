package com.study.day25_GUI;

import java.awt.Frame;

/**
 *	GUI:
 *		graphic user interface 图形用户接口
 *			用图形的方式来显示计算机的操作界面，这样更方便直观。
 *		Java为GUI提供的对象都存在java.Awt和Javax.Swing两个包中
 *		java.Awt：
 *			 Abstract Window Toolkit 抽象窗口工具包
 *			  需要调用本地系统方法实现功能，属于重量级的控件
 *		javax.Swing:
 *			在awt的基础上，建立的一套图形界面系统，其中提供了更多的组件，而且完全由Java实现，增强了移植性，
 *			属于轻量级控件
 *	CLI:
 *		Command line user interface 命令行用户接口
 *			就是常见的Dos操作命令和Linux下的shell命令。
 *			需要记忆一些常见命令，不够直观。
 */
public class FrameDemo {
	public static void main(String[] args) {
		Frame f = new Frame();
		//调用一个方法，让窗体可见
//		f.show();
		f.setVisible(true);
		
		System.out.println("hello,world!");
	}

}
