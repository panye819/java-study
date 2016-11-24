package com.study.day19_IO;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//文件名称过滤器 FilenameFilter
		File file = new File("F:\\test\\demo\\1");
		String[] strArray3 = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return new File(dir,name).isFile() && name.endsWith(".txt");
			}
		});
		for(String s3 :strArray3){
			System.out.println(s3);
		}

	}

}
