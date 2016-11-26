package com.study.day22_IO;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 *SequenceInputStream
 *需求：
 *	合并多个文件的内容到一个内容
 *格式：
 *	SequenceInputStream(Enumeration<? extends InputStream> e) 
 
 *
 */
public class SequenceInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Vector<InputStream> v = new Vector<InputStream>();
		FileInputStream s1 = new FileInputStream("IODemo\\a.txt");
		FileInputStream s2 = new FileInputStream("IODemo\\b.txt");
		FileInputStream s3 = new FileInputStream("IODemo\\c.txt");
		v.add(s1);
		v.add(s2);
		v.add(s3);
		Enumeration<InputStream> en = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(en);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IODemo2\\abc.txt"));
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=sis.read(bys)) !=-1){
			bos.write(bys,0,len);
		}
		sis.close();
		bos.close();
	}

}
