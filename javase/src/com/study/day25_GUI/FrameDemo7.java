package com.study.day25_GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * �����밸��
 *
 */
public class FrameDemo7 {
	public static void main(String[] args) {
		//�½��������
		Frame f = new Frame("QQ������֤");
		//���ô���ߴ�
		f.setBounds(400, 300, 400, 200);
		//���ò��ַ�ʽΪ��ʽ����
		f.setLayout(new FlowLayout());
		//���ñ���ɫ
		f.setBackground(Color.white);
		//��ӱ�ǩ
		Label la = new Label("����������ı���������QQ���룬ֻ����QQ���룬����������");
		//����ı���
		TextField tf = new TextField(20);
		Label la2 = new Label("��֤�����");
		TextField tf2 = new TextField(40);
		//��Ӱ�ť
		Button bt = new Button("�ύ");
		
		//����ť��ӵ�������
		f.add(la);
		f.add(tf);
		f.add(bt);
		f.add(la2);
		f.add(tf2);
		//���ô���ɼ�
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//���ð�ť�¼�
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String tf_txt = tf.getText().trim();
				if(tf_txt.matches("^[0-9]*$") && tf_txt.length() >3){
					tf2.setText("��֤�ɹ���");
				}else{
					tf2.setText("������Ĳ��ǺϷ���QQ�ţ���ȷ�Ϻ��������룡��");
					}
				//���tf
//				tf.setText("");
				tf.requestFocus();
			}
			
		});
		//���ù��
		
	}

}
