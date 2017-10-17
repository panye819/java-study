package lesson06_String;

/*
 * 	字符串与字节数组互相转换
 */
public class String06 {

	public static void main(String[] args) {
		String str = "Hello World!!!";
		byte b[] = str.getBytes();//将字符串编程字符数组
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]+"、");
		}
		
		String str1 = new String(b);//将全部的字符数组重新变为String
		System.out.println("\n"+str1);
		String str2 = new String(b,0,5);//将0~5的字符数组重新变为String
		System.out.println(str2);
	}

}
