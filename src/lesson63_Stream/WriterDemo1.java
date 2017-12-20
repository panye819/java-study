package lesson63_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;



public class WriterDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建file对象
		File file = new File("/Users/castlepan/Downloads/demo1.txt");
		//声明字符输出流
		Reader reader = null;
		//通过子类实例化
		reader = new FileReader(file);
		char c[] = new char[(int)file.length()];
		int len = reader.read(c);
		System.out.println(new String(c,0,len));
		reader.close();
				
		


	}

}
