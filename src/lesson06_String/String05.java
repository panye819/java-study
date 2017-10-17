package lesson06_String;

/*
 * 	字符串与字符数组互相转换
 */
public class String05 {

	public static void main(String[] args) {
		String str = "Hello World!!!";
		char c[] = str.toCharArray();//将字符串编程字符数组
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]+"、");
		}
		
		String str1 = new String(c);//将全部的字符数组重新变为String
		System.out.println("\n"+str1);
		String str2 = new String(c,0,5);//将0~5的字符数组重新变为String
		System.out.println(str2);
	}

}
