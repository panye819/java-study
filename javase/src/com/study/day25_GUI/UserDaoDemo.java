package com.study.day25_GUI;

/**
 *	�ӿڷ���̫�࣬���½���ֻ��Ҫ����һ��������ҲҪ������������ʵ�֣������ǿ�ʵ�֡�
 *		����취��
 *			�ӿڣ������Ƚ϶ࣩ-----�������ࣨʵ�ֽӿڣ�������ʵ�֣�-----ʵ���ࣨ��Ҫ�ĸ���д�ĸ���
 *
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
	}
}
