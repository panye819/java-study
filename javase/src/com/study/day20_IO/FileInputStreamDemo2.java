package com.study.day20_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * 计算机如何判断什么时候该把两个字符拼接成中文呢？
 * 	当返回的字节数组的元素为负值时就拼接，正数不拼接
 * 		
 * 
 *
 */
public class FileInputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("IODemo2\\a2.txt");
//		FileInputStream fis = new FileInputStream("IODemo\\a2.txt");
//		
//		int by = 0;
//		while((by=fis.read()) != -1){
//			
//			fos.write(by);
//		}
//		
//		fis.close();
//		fos.close();
		
		
		String s1 = "abcdefg";
		
		System.out.println(Arrays.toString(s1.getBytes()));
		
		String s2 = "我爱你中国";
		System.out.println(Arrays.toString(s2.getBytes()));
	}	
	
	

}
