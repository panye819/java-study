package com.study.day19_IO;

import java.io.File;

/**
 * �����޸��ļ�����
 *
 */
public class FileRenameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File srcFolder = new File("F:\\test\\demo\\1\\2\\3");
		
		File[] file = srcFolder.listFiles();
		
		String targetString = "��˳ƽ.ѭ�򽥽�ѧ.java.�����ŵ���ͨ.";
		String srcString = "";
		
		for(File f :file){
//			System.out.println(f);
//			if(f.getName().endsWith(".avi")){
//				System.out.println(f.getName().replace(targetString, srcString));
				
//			}
			String name = f.getName();
			int startIndex = name.indexOf("_");
			String numberString = name.substring(startIndex+1, startIndex+4);
//			System.out.println(numberString);
			int endIndex = name.lastIndexOf("_");
			
//			int endIndex2 = name.lastIndexOf(".");
			
			String endString = name.substring(endIndex);
//			System.out.println(endString);
			String newName = numberString.concat(endString);
			System.out.println(newName);
			
			File newFile = new File(srcFolder,newName);
			f.renameTo(newFile);

		}
	}

}
