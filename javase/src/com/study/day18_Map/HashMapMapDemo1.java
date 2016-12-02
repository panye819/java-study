package com.study.day18_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map�ӿڸ�����
 * 	����ӳ�䵽ֵ�ö���
 * 	һ��ӳ�䲻�ܰ����ظ��ļ�
 * 	ÿ�������ӳ�䵽һ��ֵ��
 *Map��˫�еģ�Collection�ǵ��е�
 *Map�ļ�Ψһ��Collection������ϵSet��Ψһ��
 *Map���ϵ����ݽṹֵ��Լ���Ч����ֵ�޹أ�Collection���ϵ����ݽṹ�����Ԫ����Ч
 *
 */
public class HashMapMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		//������ǵ�һ�δ洢����ֱ����ӣ�������ǵ�һ�δ洢�����µ�ֵ���Ǿɵ�ֵ�������ؾɵ�ֵ
		map.put("�Ƹ�", "����");
		map.put("���", "����");
		map.put("����", "��");
		map.put("����", "��κ");
		map.put("�ŷ�", "��κ");
		
		System.out.println("map:"+map);
		
		//��ռ���
//		map.clear();
//		System.out.println("map: "+map);
		System.out.println("-------------");
		//����Ԫ��
		System.out.println(map.get("�Ƹ�"));
		System.out.println(map.get("�Ƴ�"));
		System.out.println("-------------");
		//�޸�Ԫ��
		map.put("�ŷ�", "��");
		System.out.println(map.get("�ŷ�"));
		System.out.println("-------------");
		//�жϼ����Ƿ�ûΪ��
		System.out.println("map is empty: "+map.isEmpty());
		System.out.println("-------------");
		//�жϼ����Ƿ����ָ����key
		System.out.println("map contain �ŷɣ� "+map.containsKey("�ŷ�"));
		System.out.println("-------------");
		//�жϼ����Ƿ����ָ����value
		System.out.println("map contain �񺺣� "+map.containsValue("��"));
		System.out.println("map contain �󺺣� "+map.containsValue("��"));
		System.out.println("-------------");
		//���ؼ��������м��ļ���
		Set<String> set = map.keySet();
		for(String s:set){
			System.out.println("map key is : "+s);
		}
		System.out.println("-------------");
		//���ؼ���������ֵ�ļ���
		Collection<String> valueSet = map.values();
		for(String s:valueSet){
			System.out.println("map value is : "+s);
		}
		System.out.println("-------------");
		//map����
		Set<String> mapSet = map.keySet();
		for(String s:mapSet){
//			System.out.println("map key is : "+s+"--its value is:"+map.get(s));
			System.out.println(s+":"+map.get(s));
			//��ȡ���м�ֵ�Զ���
			System.out.println("-------------");
			Set<Map.Entry<String,String>> setMap = map.entrySet();
			for(Map.Entry<String,String> s1:setMap){
				String key = s1.getKey();
				String value = s1.getValue();
				System.out.println("key is : "+key+"--value is: "+value);
			}
		}
		
	} 

}
