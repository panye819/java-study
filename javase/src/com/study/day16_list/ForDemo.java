package com.study.day16_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ��ǿfor
 *	��ʽ��for(Ԫ���������� ����: ������߼���
 *	ʹ�øñ������ɣ��ñ�������Ԫ��
 *	�ô���
 *		��������ͼ��ϵı���
 *	�׶ˣ�
 *		��ǿfor��Ŀ�겻��Ϊnull
 *		��ν����
 *			����ǿfor��Ŀ���Ƚ��в�Ϊnull���жϣ�Ȼ���ٱ�����
 */
public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int x = 0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
		System.out.println("----------------");
		//��ǿfor
		//��ʽ��for(Ԫ���������� ����: ������߼���
				//ʹ�øñ������ɣ��ñ�������Ԫ��
		for(int x:arr){
			System.out.println(x);
		}
		System.out.println("----------------");
		//
		String[] strArr = {"����","��ɭ��","������","����","�Ͼ�"};
		for(String s : strArr){
			System.out.println(s);
		}
		System.out.println("----------------");
		//
		Collection <String>col = new ArrayList<String>();
		col.add("�ֿ���");
		col.add("��¥��");
		col.add("�ػ���");

		for(String c : col){
			System.out.println(c);
		}
		System.out.println("----------------");
		//
		List <String>list = null;
		//java.lang.NullPointerException
		
		if(list != null){
			for(String s : list){
				System.out.println(s);	
		}
		}else{
			System.out.println("object is null!!");
		
		}
		
		
		
	}

}
