package com.study.day25_GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * ���岼�֣�
 * 	��������������з�ʽ�������Ĭ�ϲ���Ϊ�߽粼��
 *
 */
public class FrameDemo4 {
	public static void main(String[] args) {
		//�½��������
		Frame f = new Frame("���尴ť����");
		//���ô���ߴ�
		f.setBounds(400, 300, 400, 200);
		//���ò��ַ�ʽΪ��ʽ����
		f.setLayout(new FlowLayout());
		//��Ӱ�ť
		Button bt = new Button("���ǰ�ť1");
		bt.setSize(100, 100);
		Button bt1 = new Button("���ǰ�ť2");
		bt1.setSize(100, 100);
		
		//����ť��ӵ�������
		f.add(bt);
		f.add(bt1);
		
		//���ô���ɼ�
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���ٵ����ԣ���");
				
			}
		});
		
	}

}
