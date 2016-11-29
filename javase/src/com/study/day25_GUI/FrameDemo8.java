package com.study.day25_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

/**
 * �˵���������
 *
 */
public class FrameDemo8 {
	public static void main(String[] args) {
		//�½��������
		Frame f = new Frame("�༶�˵�");
		//���ô���ߴ�
		f.setBounds(400, 300, 400, 200);
		String name = f.getTitle();
		//���ò��ַ�ʽΪ��ʽ����
		f.setLayout(new FlowLayout());
		//���ñ���ɫ
		f.setBackground(Color.white);
		//�����˵���
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("�ļ�");
		Menu m2 = new Menu("��������");
		Menu m3 = new Menu("�������");
		
		MenuItem mi3 = new MenuItem("�򿪼��±�");
		MenuItem mi4 = new MenuItem("�˳����");
		MenuItem mi5 = new MenuItem("�ú�ѧϰ");
		MenuItem mi6 = new MenuItem("��������");
		MenuItem mi7 = new MenuItem("�ָ�����");
		//����ť��ӵ�������
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m1.add(m2);
		m1.add(mi3);
		m1.add(mi4);

		mb.add(m1);
		mb.add(m3);
		f.setMenuBar(mb);
		
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
		mi5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setTitle(mi5.getLabel());
				
			}
		});
		mi6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setTitle(mi6.getLabel());
			}
		});
		mi7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.setTitle(name);
			}
		});
		mi3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Runtime rt = Runtime.getRuntime();
				try {
					rt.exec("notepad");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		mi4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

}
