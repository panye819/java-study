package com.study.day12_String;

/**
 * 	字符串转换功能
 * 	byte[] getBytes()  使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。 			
 * 	char[] toCharArray():把字符串转换成字符数组。
 *  static String valueOf(char[] chs):把字符数组转换为字符串
 *  static String valueOf(int i):把int类型数据转换成字符串
 *  		这里定义为int类型而没有定义为char类型，是因为如果定义为char类型的话，只能输入字符，
 *  		而定义为int类型，根据ASCII码可以知道既可以输入字符，也可以输入字符所对应的数字
 *  String toLowCase():将字符串转换为小写
 *  String toUpperCase():将字符串转换为大写
 *  String concat(String str):将字符拼接起来
 */
public class StringDemo6 {

	public static void main(String[] args) {
		String s = "Hello123World";
		byte[] bys = s.getBytes();
		for(int x=0;x<bys.length;x++){
//			System.out.println("s in "+x+" is "+bys[x]);
			System.out.print((char)bys[x]);//这里默认输出的是字符的ascii码值，用(char)进行强制转换
			}
		System.out.println("--------------");
		char[] chs = s.toCharArray();
		for(int x=0;x<chs.length;x++){
			System.out.print(chs[x]);
		}
		System.out.println("--------------");
		String s1 = String.valueOf(chs);
		System.out.println(s1);
		System.out.println("--------------");
		String s2 = String.valueOf(97);
		System.out.println(s2);
		System.out.println("--------------");
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
