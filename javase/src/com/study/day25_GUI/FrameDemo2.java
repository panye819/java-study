package com.study.day25_GUI;

import java.awt.Frame;

/**

 */
public class FrameDemo2 {
	public static void main(String[] args) {
		Frame f = new Frame("����֮��ĵ��ù�ϵ");
		//���崰���С
//		f.setSize(400, 300);
//		f.setLocation(400, 200);
		
		f.setBounds(400,300,400,200);
		//����һ���������ô���ɼ�
//		f.show();
		f.setVisible(true);
	}

}
