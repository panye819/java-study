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
 * 菜单界面制作
 *
 */
public class FrameDemo8 {
	public static void main(String[] args) {
		//新建窗体对象
		Frame f = new Frame("多级菜单");
		//设置窗体尺寸
		f.setBounds(400, 300, 400, 200);
		String name = f.getTitle();
		//设置布局方式为流式布局
		f.setLayout(new FlowLayout());
		//设置背景色
		f.setBackground(Color.white);
		//创建菜单栏
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("更改名称");
		Menu m3 = new Menu("关于软件");
		
		MenuItem mi3 = new MenuItem("打开记事本");
		MenuItem mi4 = new MenuItem("退出软件");
		MenuItem mi5 = new MenuItem("好好学习");
		MenuItem mi6 = new MenuItem("天天向上");
		MenuItem mi7 = new MenuItem("恢复标题");
		//将按钮添加到窗体中
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m1.add(m2);
		m1.add(mi3);
		m1.add(mi4);

		mb.add(m1);
		mb.add(m3);
		f.setMenuBar(mb);
		
		//设置窗体可见
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//设置按钮事件
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
