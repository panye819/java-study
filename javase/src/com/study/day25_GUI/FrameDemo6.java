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
 * 鼠标进入案例
 *
 */
public class FrameDemo6 {
	public static void main(String[] args) {
		//新建窗体对象
		Frame f = new Frame("鼠标进入案例");
		//设置窗体尺寸
		f.setBounds(400, 300, 400, 200);
		//设置布局方式为流式布局
		f.setLayout(new FlowLayout());
		//设置背景色
		f.setBackground(Color.white);
		//添加按钮
		Button greenButton = new Button("绿色");
		Button redButton = new Button("红色");
		Button blueButton = new Button("蓝色");
		Button yellowButton = new Button("黄色");
		//将按钮添加到窗体中

		f.add(greenButton);
		f.add(redButton);
		f.add(blueButton);
		f.add(yellowButton);
		
		
		//设置窗体可见
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//对按钮添加鼠标点击事件
		redButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.red);
			}
		});
		//对按钮添加鼠标进入事件
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				f.setBackground(Color.green);
			}
		});
		//对按钮添加鼠标移出事件
		greenButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				f.setBackground(Color.white);
			}
		});
		//添加鼠标
		
	}

}
