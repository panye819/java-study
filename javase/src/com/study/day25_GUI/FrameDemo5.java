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
 * 窗体布局：
 * 	窗体中组件的排列方式。窗体的默认布局为边界布局
 *
 */
public class FrameDemo5 {
	public static void main(String[] args) {
		//新建窗体对象
		Frame f = new Frame("数据转换");
		//设置窗体尺寸
		f.setBounds(400, 300, 400, 200);
		//设置布局方式为流式布局
		f.setLayout(new FlowLayout());
		//创建文本域
		TextField tf = new TextField(20);
		//添加按钮
		Button bt = new Button("数据转移");
//		Button bt1 = new Button("我是按钮2");
//		bt1.setSize(100, 100);
		//添加文本域
		TextArea ta = new TextArea(10,40);
		//将按钮添加到窗体中

//		f.add(bt1);
		f.add(tf);
		f.add(bt);
		f.add(ta);
		
		
		//设置窗体可见
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
				//获取文本框的值
				String tf_text = tf.getText().trim();
				
				tf.setText("");
//				ta.setText(tf_text);
				//追加并换行
				ta.append(tf_text+"\r\n");
				//获取光标
				tf.requestFocus();
				
			}
		});
		
	}

}
