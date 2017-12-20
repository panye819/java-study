package lesson63_Stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建file对象
		File file = new File("/Users/castlepan/Downloads/demo.txt");
		//声明字节输出流
		OutputStream  out = null;
		//通过子类实例化
//		out = new FileOutputStream(file);//覆盖原文件中的内容
		out = new FileOutputStream(file,true);//追加内容模式，不会清空原文件信息
		//要输出的信息
		String str = "Hello World!!!Again！！！\r\n";
		//将String变为byte数组
		byte b[] = str.getBytes();
		//写入数据
		out.write(b);
		//关闭流
		out.close();
		

	}

}
