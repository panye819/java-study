package com.study_day19_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FlieInputStram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("a.txt");
//		//��ȡ����
//		int by = 0;
//		while ((by=fis.read()) !=-1){
//			System.out.print((char)by);
//		}
		byte[] bys = new byte[1024];
		int len = 0;
		while ((len=fis.read(bys)) != -1){
			System.out.print(new String(bys,0,len));
		}
		//�ͷ���Դ
		fis.close();
	}

}
