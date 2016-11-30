package com.study.day05_array;

/**
 * ��ά����
 * 	��ʵ����һ��Ԫ��Ϊһά���������
 * 	�����ʽ��
 * 		1����������[][] ��ά������ = new ��������[m][n]
 * 			m�����м���һά����Ԫ��
 * 			n����һά����ĳ���
 * 		2����������[][] ��ά������ = new ��������[m][]
 * 			���ָ�ʽû��nֵ����ʾһά����ĸ���û��ָ�������Զ�̬������
 * 			˵�����ǿ��Ա仯�ġ�
 * 		3����������[][] ��ά������ = new ��������[][]{{Ԫ��......},{Ԫ��......},{Ԫ��......},{Ԫ��......}}
		Ҳ����д�ɣ�
 			��������[][] ��ά������ = ��������{{Ԫ��......},{Ԫ��......},{Ԫ��......},{Ԫ��......}}
  */	
public class ArrayDemo2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("-----------");
		System.out.println(arr[0][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
		System.out.println("------���Ƿָ���------");
		
		int[][] arr2 = new int[4][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[1];
		arr2[3] = new int[2];
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println("-----------");
		System.out.println(arr2[0][2]);
		System.out.println(arr2[1][2]);
		System.out.println(arr2[2][0]);
		System.out.println(arr2[3][1]);
		System.out.println("------���Ƿָ���------");
		int[][] arr3 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println("-----------");
		System.out.println(arr3[0][2]);
		System.out.println(arr3[1][1]);
		System.out.println(arr3[2][3]);
	}
}
