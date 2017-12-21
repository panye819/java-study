package lesson74_Serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArraySerDemo {
	public static void main(String[] args) throws Exception{
		Person per[] = {new Person("Tom",33,"M"),new Person("Jerry",32,"M"),
				new Person("Henry",22,"F")};
		ser(per);
		dser();
		print(per);
	}
	public static void ser(Object obj) throws Exception{
		File file = new File("/Users/castlepan/Downloads/person.ser");
		ObjectOutputStream oss = null;
		oss = new ObjectOutputStream(new FileOutputStream(file));
		oss.writeObject(obj);
		oss.close();
	}
	public static Object dser() throws Exception{
		Object temp = null;
		File file = new File("/Users/castlepan/Downloads/person.ser");
		ObjectInputStream ois = null;
		ois = new ObjectInputStream(new FileInputStream(file));
		temp = ois.readObject();
		ois.close();
		return temp;
	}
	public static void print(Person per[]) {
		for(Person p:per) {
			System.out.println(p);
		}
	}
	
}
