package com.study_day19_IO;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File dir = new File("E:/Selenium");
		listAllFile(dir);
	}
	
	//�г������ļ�
	public static void listAllFile(File f){
//		System.out.println(f);
		//��һ�����ļ�
		File[] fs = f.listFiles();
		for (File file:fs){
//			System.out.println(file);
			if(file.isDirectory()){
				listAllFile(file);
			}else{
			System.out.println(file);
			}

//			//�ڶ���
//			if(file.isDirectory()){
//				File[] fs2 = file.listFiles();
//				for(File file2:fs2){
//					System.out.println(file2);
//				}
//			}
		}
	}
}
