package com.study.day20_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流是 用来传递设备之间的数据传输
 * 按照数据流向：
 * 		输出流
 * 		输入流
 * 
 * 按照数据类型：
 * 		字节流
 * 			如果什么都不知道，就用字节流
 * 			字节输入流   InputStream
 * 			字节输出流  OutPutStream
 * 		字符流
 * 			如果数据所在文件能用windows下的记事本打开并能读懂里面的内容，就用字符流
 * 			字符输入流 Reader
 * 			字符输出流 Writer
 *	最后要关闭流对象,通知系统去释放相关资源
 *			 XXX.close();
 *	如何实现数据换行
 *		初步办法，增加换行符
 *	如何实现数据追加写入
 *		调用带boolean参数的构造方法
 *		FileOutputStream fos1 = new FileOutputStream("IODemo\\b.txt",true);
 */
public class FileOutStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建对象
//		File file1 = new File("IODemo");
//		System.out.println(file1.mkdir());
		FileOutputStream fos = new FileOutputStream("IODemo\\a.txt");
//		//写数据
//		fos.write("hello IO".getBytes());
//		fos.write("Java".getBytes());
		//关闭资源
//		fos.close();
		FileOutputStream fos1 = new FileOutputStream("IODemo\\b.txt",true);
		for(int x=0;x<10;x++){
			fos1.write(("hello"+x).getBytes());
			fos1.write("\n".getBytes());
		}
		fos1.close();
	}

}
