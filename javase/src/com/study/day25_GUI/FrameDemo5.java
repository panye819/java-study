package com.study.day25_GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���岼�֣�
 * 	��������������з�ʽ�������Ĭ�ϲ���Ϊ�߽粼��
 *
 */
public class FrameDemo5 {
	public static void main(String[] args) {
		//�½��������
		Frame f = new Frame("����ת��");
		//���ô���ߴ�
		f.setBounds(400, 300, 400, 200);
		//���ò��ַ�ʽΪ��ʽ����
		f.setLayout(new FlowLayout());
		//�����ı���
		TextField tf = new TextField(20);
		//��Ӱ�ť
		Button bt = new Button("����ת��");
//		Button bt1 = new Button("���ǰ�ť2");
//		bt1.setSize(100, 100);
		//����ı���
		TextArea ta = new TextArea(10,40);
		//����ť��ӵ�������

//		f.add(bt1);
		f.add(tf);
		f.add(bt);
		f.add(ta);
		
		
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
				//��ȡ�ı����ֵ
				String tf_text = tf.getText().trim();
				
				tf.setText("");
//				ta.setText(tf_text);
				//׷�Ӳ�����
				ta.append(tf_text+"\r\n");
				//��ȡ���
				tf.requestFocus();
				
			}
		});
		
	}

}
