package com.study_day19_IO;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File:�ļ���Ŀ¼·�����ĳ����ʾ��ʽ,δ������ʵ���ڵġ�
 * ���췽����
 * 		File(String pathname)
 * 		File(String parent,String child)
 * 
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {

		//��������
		//�����ļ���,���Ҫ�������ļ����Ѵ��ڣ��򲻻ᴴ��
		File file3 = new File("F:\\test\\demo");
		System.out.println("mkdir demo: "+file3.mkdir());
		//��demoĿ¼�£������ļ�a.txt
		File file = new File("F:\\test\\demo\\a.txt");
//		System.out.println("creat a.txt : "+file.createNewFile());
//		//��demo�ļ����£�����/1/2/3/a.txt�ṹ���ļ�
////		File file2 = new File("F:\\test\\demo\\1\\2\\3","a.txt");
////		System.out.println("mkdirs : "+file2.mkdirs());//��������������a.txt��ʵ�������ļ�����������Ϊa.txt���ļ���
//		File file2 = new File("F:\\test\\demo\\1\\2\\3");
		File file4 = new File("F:\\test\\demo\\1\\2\\3\\a.txt");
//		System.out.println("mkdirs : "+file2.mkdirs());
//		System.out.println("mkidrs : "+file4.createNewFile());//��������������a.txt��������Ϊa.txt���ļ����������ļ���
		//ɾ������,java�е�ɾ�����߻���վ
		//����ֱ��ɾ���ǿ��ļ���
		System.out.println("delete : "+file.delete());
		//����������
		File file6 = new File("F:\\test\\demo\\b.txt");
		System.out.println("rename : "+file.renameTo(file6));//���·����ͬ�����Ǽ��в�����
		//�жϹ���
		System.out.println("exist : "+file6.exists());
		System.out.println("exist : "+file.exists());
		System.out.println("is directory: "+file3.isDirectory());
		System.out.println("is file: "+file6.isFile());
		System.out.println("can read: "+file6.canRead());
		System.out.println("can read: "+file6.canWrite());
		System.out.println("is hidden: "+file6.isHidden());
		System.out.println("--------------------------------");
		//��ȡ����
		System.out.println("abs: "+file6.getAbsolutePath());
		System.out.println("path: "+file6.getPath());
		System.out.println("name: "+file6.getName());
		System.out.println("length: "+file6.length());//�ֽ���
		System.out.println("lastModify: "+file6.lastModified());//����ֵ
		Date d = new Date(1479906188846L);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(d);
		System.out.println(s);
		System.out.println("--------------------------------");
		//�߼���ȡ����
		//public String[] list() :��ȡָ��Ŀ¼�µ������ļ������ļ������Ƶ���������
		File f7 = new File("F:\\test\\demo");
		String[] strArray = f7.list();
		for(String s1: strArray){
			System.out.println(s1);
		}
		System.out.println("--------------------------------");
		//public File[] listFile():��ȡָ��Ŀ¼�µ������ļ������ļ������Ƶ��ļ�����
		File[] fileArray = f7.listFiles();
		for(File f : fileArray){
			System.out.println(f.getName()+" : "+f.length());
			
		}
		System.out.println("--------------------------------");
		//�ж�·�����Ƿ�����.txt��β���ļ����о����
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
