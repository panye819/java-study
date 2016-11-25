package com.study.day22_IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *SequenceInputStream
 *		SequenceInputStream 表示其他输入流的逻辑串联。
 *			它从输入流的有序集合开始，并从第一个输入流开始读取，直到到达文件末尾，接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末尾为止。
 *格式：
 *	SequenceInputStream(InputStream s1, InputStream s2) 
 
 *
 */
public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream s1 = new FileInputStream("IODemo\\a.txt");
		FileInputStream s2 = new FileInputStream("IODemo\\b.txt");
		SequenceInputStream sis = new SequenceInputStream(s1,s2);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IODemo2\\ab.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=sis.read(bys)) !=-1){
			bos.write(bys,0,len);
		}
		sis.close();
		bos.close();
	}

}
