package com.study.day13_Integer_Character;

/**
 * 	Character:
 * 		Character 类在对象中包装一个基本类型 char 的值。Character 类型的对象包含类型为 char 的单个字段。
 * 		此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然。 
 *
 */
public class CharacterDemo {

	public static void main(String[] args) {
		String s = "Hello123World";
		
		char[] chs = s.toCharArray();
		int lowCaseNumber = 0;
		int upperCaseNumber = 0;
		int digitNumber = 0;
		
		
		for(int x=0;x<chs.length;x++){
			if(Character.isLowerCase(chs[x])){
				lowCaseNumber++;
			}else if(Character.isUpperCase(chs[x])){
				upperCaseNumber++;
			}else if(Character.isDigit(chs[x])){
				digitNumber++;
			}
		}
		System.out.println("lowCaseNumber is "+lowCaseNumber);
		System.out.println("upperCaseNumber is "+upperCaseNumber);
		System.out.println("digitNumber is "+digitNumber);
	}	

}
