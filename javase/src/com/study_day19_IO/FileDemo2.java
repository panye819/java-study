package com.study_day19_IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File:文件和目录路径名的抽象表示形式,未必是真实存在的。
 * 构造方法：
 * 		File(String pathname)
 * 		File(String parent,String child)
 * 
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {

		//创建功能
		//创建文件夹,如果要创建的文件夹已存在，则不会创建
		File file3 = new File("F:\\test\\demo");
		System.out.println("mkdir demo: "+file3.mkdir());
		//在demo目录下，创建文件a.txt
		File file = new File("F:\\test\\demo\\a.txt");
//		System.out.println("creat a.txt : "+file.createNewFile());
//		//在demo文件夹下，创建/1/2/3/a.txt结构的文件
////		File file2 = new File("F:\\test\\demo\\1\\2\\3","a.txt");
////		System.out.println("mkdirs : "+file2.mkdirs());//这样创建出来的a.txt其实并不是文件，而是名字为a.txt的文件夹
//		File file2 = new File("F:\\test\\demo\\1\\2\\3");
		File file4 = new File("F:\\test\\demo\\1\\2\\3\\a.txt");
//		System.out.println("mkdirs : "+file2.mkdirs());
//		System.out.println("mkidrs : "+file4.createNewFile());//这样创建出来的a.txt才是名字为a.txt的文件，而不是文件夹
		//删除功能,java中的删除不走回收站
		//不能直接删除非空文件夹
		System.out.println("delete : "+file.delete());
		//重命名功能
		File file6 = new File("F:\\test\\demo\\b.txt");
		System.out.println("rename : "+file.renameTo(file6));//如果路径不同，就是剪切并改名
		//判断功能
		System.out.println("exist : "+file6.exists());
		System.out.println("exist : "+file.exists());
		System.out.println("is directory: "+file3.isDirectory());
		System.out.println("is file: "+file6.isFile());
		System.out.println("can read: "+file6.canRead());
		System.out.println("can read: "+file6.canWrite());
		System.out.println("is hidden: "+file6.isHidden());
		System.out.println("--------------------------------");
		//获取功能
		System.out.println("abs: "+file6.getAbsolutePath());
		System.out.println("path: "+file6.getPath());
		System.out.println("name: "+file6.getName());
		System.out.println("length: "+file6.length());//字节数
		System.out.println("lastModify: "+file6.lastModified());//毫秒值
		Date d = new Date(1479906188846L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("--------------------------------");
		//高级获取功能
		//public String[] list() :获取指定目录下的所有文件或者文件夹名称的名称数组
		File f7 = new File("F:\\test\\demo");
		String[] strArray = f7.list();
		for(String s1: strArray){
			System.out.println(s1);
		}
		System.out.println("--------------------------------");
		//public File[] listFile():获取指定目录下的所有文件或者文件夹名称的文件数组
		File[] fileArray = f7.listFiles();
		for(File f : fileArray){
			System.out.println(f.getName()+" : "+f.length());
			
		}
		System.out.println("--------------------------------");
		//判断路径下是否有以.txt结尾的文件，有就输出
		File file8 = new File("F:\\test\\demo\\");
		File[] fileArray2 = file8.listFiles();
		for(File f1 :fileArray2){
//			System.out.println(f1);
			if(f1.isFile()){
				if(f1.getName().endsWith(".txt")){
					System.out.println(f1);
				}
			}
				
		}
		System.out.println("--------------------------------");

	}
}
