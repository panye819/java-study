package lesson06_String;

/*
 * 	字符串题目：
 * 		1、给定一下字符串：TOM:89|JERRY:90|TONY:78
 * 			要求拆分：
 * 				TOM -> 89
 * 				JERRY -> 90
 * 				TONY -> 78
 * 		2、	给定一个email地址，判断其是否合法，判断是否有@和"."	
 * 	
 */
public class String07 {

	public static void main(String[] args) {
		String str = "TOM:89|JERRY:90|TONY:78";
		String[] str1 = str.split("\\|");
		//两种方法
		//方法一：
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i].replaceAll("\\:", "\\-->"));	
			}
		System.out.println("-------我是分隔线---------");
		//方法二：
		for(int i=0;i<str1.length;i++) {
			//两种方法
			String[] str2 = str1[i].split(":");
			System.out.println(str2[0]+"-->"+str2[1]);
			}
		//判断email地址是否合法，判断是否有@和"."
		System.out.println("-------我是分隔线---------");
		String email_1 = "admin@admin.com";
		String email_2 = "admin";
			if(email_1.contains("@") && email_1.contains(".")) {
				System.out.println("The email address is valid...");
			}else {
				System.out.println("The email address is invalid...");
			}
			if(email_2.contains("@") && email_2.contains(".")) {
				System.out.println("The email address is valid...");
			}else {
				System.out.println("The email address is invalid...");
			}
		}
		
		
}