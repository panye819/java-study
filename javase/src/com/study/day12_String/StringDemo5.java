package com.study.day12_String;

/**
 * 	����ͳ�Ƹ������ַ����У���д��ĸ��Сд��ĸ�����ֵĸ���
 * 		
 * 		
 */
public class StringDemo5 {

	public static void main(String[] args) {
		String s = "Hello123World";
		int bigCount = 0;
		int smallCount = 0;
		int numCount = 0;
		
		for(int x=0;x<s.length();x++){
			char ch = s.charAt(x);
			if(ch>'a' && ch<'z'){
				smallCount++;
			}else if(ch>'A' && ch<'Z'){
				bigCount++;
			}else if(ch>'0' && ch <'9'){
				numCount++;
			}
		}
		System.out.println(bigCount);
		System.out.println(smallCount);
		System.out.println(numCount);
	}

}
