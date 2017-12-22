package lesson60_File;

import java.io.File;
import java.io.IOException;


public class FileDemo1 {
	public static void main(String[] args) {
		File file = new File("/Users/castlepan/Downloads/demofile/demo4.txt");
		//创建新文件
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//删除文件
		file.delete();
		if(!(file.exists())) {
			System.out.println("文件已经成功删除。。。。");
		}else {
			System.out.println("文件删除失败，请重试！！");
		}
	}
}
