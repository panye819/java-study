package lesson66_PrintStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo1 {
	public static void main(String[] args) throws Exception {
		File file = new File("/Users/castlepan/Downloads/demo3.txt");
		PrintStream out = new PrintStream(new FileOutputStream(file));
		out.println("hello");
		out.println("world");
		out.println(19);
		out.println(12.34);
		String name = "Tom";
		int age = 20;
		float score = 99.9f;
		char gender = 'M';
		
		out.printf("姓名：%s;年龄：%d;成绩：%5.2f;性别：%c .", name,age,score,gender);
		out.close();
		
		
	}
}
