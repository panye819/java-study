package lesson60_File;

import java.io.File;
import java.io.IOException;


public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("/Users/castlepan/Downloads/demofile/demo5.txt");
		//创建新文件
		if(file.exists()) {
			System.out.println("文件存在，不用创建");
		}else {
			System.out.println("文件不存在，创建文件中。。。。");
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//检查文件是否存在
		if(file.exists()) {
			System.out.println("文件已经成功创建。。。。");
		}else {
			System.out.println("文件创建失败，请重试！！");
		}
	}
}
