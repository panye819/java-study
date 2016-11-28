package com.study.day25_GUI;

import java.awt.Frame;

/**

 */
public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("方法之间的调用关系");
		//定义窗体大小
//		f.setSize(400, 300);
//		f.setLocation(400, 200);
		
		f.setBounds(400,300,400,200);
		//调用一个方法，让窗体可见
//		f.show();
		f.setVisible(true);
	}

}
