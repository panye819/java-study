package lesson60_File;

import java.io.File;



public class FileDemo3 {
	public static void main(String[] args) {
		File file = new File("/Users/castlepan/Downloads/demofile");
		String path[] = file.list();//仅仅打印出目录下的文件或文件夹名称
		for(int x=0;x<path.length;x++) {
			System.out.println(path[x]);
		}
		System.out.println(" ");
		File[] list = file.listFiles();//打印出目录下的文件或者文件夹的绝对路径
		for(int x=0;x<path.length;x++) {
			System.out.print(list[x].getParent()+"-->");
			System.out.println(list[x].getPath());
		}
		
	}
}
