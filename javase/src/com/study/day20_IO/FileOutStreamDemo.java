package com.study.day20_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO���� ���������豸֮������ݴ���
 * ������������
 * 		�����
 * 		������
 * 
 * �����������ͣ�
 * 		�ֽ���
 * 			���ʲô����֪���������ֽ���
 * 			�ֽ�������   InputStream
 * 			�ֽ������  OutPutStream
 * 		�ַ���
 * 			������������ļ�����windows�µļ��±��򿪲��ܶ�����������ݣ������ַ���
 * 			�ַ������� Reader
 * 			�ַ������ Writer
 *	���Ҫ�ر�������,֪ͨϵͳȥ�ͷ������Դ
 *			 XXX.close();
 *	���ʵ�����ݻ���
 *		�����취�����ӻ��з�
 *	���ʵ������׷��д��
 *		���ô�boolean�����Ĺ��췽��
 *		FileOutputStream fos1 = new FileOutputStream("IODemo\\b.txt",true);
 */
public class FileOutStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//��������
//		File file1 = new File("IODemo");
//		System.out.println(file1.mkdir());
		FileOutputStream fos = new FileOutputStream("IODemo\\a.txt");
//		//д����
//		fos.write("hello IO".getBytes());
//		fos.write("Java".getBytes());
		//�ر���Դ
//		fos.close();
		FileOutputStream fos1 = new FileOutputStream("IODemo\\b.txt",true);
		for(int x=0;x<10;x++){
			fos1.write(("hello"+x).getBytes());
			fos1.write("\n".getBytes());
		}
		fos1.close();
	}

}
