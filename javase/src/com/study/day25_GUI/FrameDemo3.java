package com.study.day25_GUI;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *	�¼�������
 *		1���¼�Դ���¼������ĵط�
 *		2���¼�������Ҫ����������
 *		3���¼�������������¼������Ĵ�����
 *		4���¼����������ǰ��¼�Դ���¼���������
 *
 */
public class FrameDemo3 {
	public static void main(String[] args) {
		Frame f = new Frame("�رմ���");
		//���崰���С
//		f.setSize(400, 300);
//		f.setLocation(400, 200);
		
		f.setBounds(400,300,400,200);
		//����һ���������ô���ɼ�
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
