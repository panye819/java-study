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
 * 鼠标进入案例
 *
 */
public class FrameDemo7 {
	public static void main(String[] args) {
		//新建窗体对象
		Frame f = new Frame("QQ号码验证");
		//设置窗体尺寸
		f.setBounds(400, 300, 400, 200);
		//设置布局方式为流式布局
		f.setLayout(new FlowLayout());
		//设置背景色
		f.setBackground(Color.white);
		//添加标签
		Label la = new Label("请在下面的文本框中输入QQ号码，只能是QQ号码，不信你试试");
		//添加文本框
		TextField tf = new TextField(20);
		Label la2 = new Label("验证结果：");
		TextField tf2 = new TextField(40);
		//添加按钮
		Button bt = new Button("提交");
		
		//将按钮添加到窗体中
		f.add(la);
		f.add(tf);
		f.add(bt);
		f.add(la2);
		f.add(tf2);
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
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String tf_txt = tf.getText().trim();
				if(tf_txt.matches("^[0-9]*$") && tf_txt.length() >3){
					tf2.setText("验证成功！");
				}else{
					tf2.setText("你输入的不是合法的QQ号，请确认后重新输入！！");
					}
				//清空tf
//				tf.setText("");
				tf.requestFocus();
			}
			
		});
		//设置光标
		
	}

}
