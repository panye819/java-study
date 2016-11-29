package com.study.day25_GUI;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	事件监听：
 *		1、事件源：事件发生的地方
 *		2、事件：就是要发生的事情
 *		3、事件处理：就是针对事件作出的处理方案
 *		4、事件监听：就是把事件源和事件关联起来
 *
 */
public class FrameDemo3 {
	public static void main(String[] args) {
		Frame f = new Frame("关闭窗体");
		//定义窗体大小
//		f.setSize(400, 300);
//		f.setLocation(400, 200);
		
		f.setBounds(400,300,400,200);
		//调用一个方法，让窗体可见
//		f.show();
		f.setVisible(true);
		
//		f.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// TODO Auto-generated method stub
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}

}
