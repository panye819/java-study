package lesson74_Serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception{
		File file = new File("/Users/castlepan/Downloads/demo3.ser");
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(file));
		Object obj = ois.readObject();
		Person per = (Person)obj;
		System.out.println(per);
		ois.close();
		
		
	}
	
}
