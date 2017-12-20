package lesson63_Stream;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;



public class ReaderDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建file对象
		File file = new File("/Users/castlepan/Downloads/demo1.txt");
		//声明字符输出流
		Writer writer = null;
		//通过子类实例化
		writer = new FileWriter(file,true);
		String str = "Hello word.\r\n";
		
		writer.write(str);
		
		writer.close();
				
		


	}

}
