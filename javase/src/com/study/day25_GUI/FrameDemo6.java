package com.study.day25_GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �����밸��
 *
 */
public class FrameDemo6 {
	public static void main(String[] args) {
		//�½��������
		Frame f = new Frame("�����밸��");
		//���ô���ߴ�
		f.setBounds(400, 300, 400, 200);
		//���ò��ַ�ʽΪ��ʽ����
		f.setLayout(new FlowLayout());
		//���ñ���ɫ
		f.setBackground(Color.white);
		//��Ӱ�ť
		Button greenButton = new Button("��ɫ");
		Button redButton = new Button("��ɫ");
		Button blueButton = new Button("��ɫ");
		Button yellowButton = new Button("��ɫ");
		//����ť��ӵ�������

		f.add(greenButton);
		f.add(redButton);
		f.add(blueButton);
		f.add(yellowButton);
		
		
		//���ô���ɼ�
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//�԰�ť���������¼�
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.red);
			}
		});
		//�԰�ť����������¼�
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.green);
			}
		});
		//�԰�ť�������Ƴ��¼�
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				f.setBackground(Color.white);
			}
		});
		//������
		
	}

}
