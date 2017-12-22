package lesson60_File;

import java.io.File;



public class MakeDirDemo {
	public static void main(String[] args) {
		File file = new File("/Users/castlepan/Downloads/demofile/test");
		//创建文件夹,只能创建一级
		file.mkdir();
		//创建多级文件夹
		File file2 = new File("/Users/castlepan/Downloads/demofile/test/1/2/3");
		file2.mkdirs();
		
		//删除文件夹
	}
}
