package com.study.day13_Integer_Character;

/**
 * 	Character:
 * 		Character ���ڶ����а�װһ���������� char ��ֵ��Character ���͵Ķ����������Ϊ char �ĵ����ֶΡ�
 * 		���⣬�����ṩ�˼��ַ�������ȷ���ַ������Сд��ĸ�����֣��ȵȣ��������ַ��Ӵ�дת����Сд����֮��Ȼ�� 
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
