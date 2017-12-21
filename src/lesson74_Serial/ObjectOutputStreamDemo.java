package lesson74_Serial;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		File file = new File("/Users/castlepan/Downloads/demo3.ser");
		ObjectOutputStream oss = null;
		oss = new ObjectOutputStream(new FileOutputStream(file));
		Person per = new Person("Tom",33,"M");
		oss.writeObject(per);
		oss.close();
		
	}
	
}
