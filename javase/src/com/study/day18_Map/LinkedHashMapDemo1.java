package com.study.day18_Map;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap:��Map�ӿڵĹ�ϣ��������б��ʵ�֣����п�Ԥ֪�ĵ���˳��
 *��Hash��֤����Ψһ�ԣ�������֤��������
 */
public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		hm.put("1", "�Ƹ�");
		hm.put("2", "���");
		hm.put("3", "����");
		hm.put("1", "����");
		hm.put("4", "�ŷ�");
		hm.put("4", "����");
		System.out.println("hm contain : "+hm);
		
	} 

}
