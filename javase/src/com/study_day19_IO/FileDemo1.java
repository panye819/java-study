package com.study_day19_IO;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File dir = new File("E:/Selenium");
		listAllFile(dir);
	}
	
	//列出所有文件
	public static void listAllFile(File f){
//		System.out.println(f);
		//第一级子文件
		File[] fs = f.listFiles();
		for (File file:fs){
//			System.out.println(file);
			if(file.isDirectory()){
				listAllFile(file);
			}else{
			System.out.println(file);
			}

//			//第二级
//			if(file.isDirectory()){
//				File[] fs2 = file.listFiles();
//				for(File file2:fs2){
//					System.out.println(file2);
//				}
//			}
		}
	}
}
