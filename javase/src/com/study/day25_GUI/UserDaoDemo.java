package com.study.day25_GUI;

/**
 *	接口方法太多，哪怕仅仅只需要其中一个方法，也要把其他方法都实现，哪怕是空实现。
 *		解决办法：
 *			接口（方法比较多）-----适配器类（实现接口，仅仅空实现）-----实现类（需要哪个重写哪个）
 *
 */
public class UserDaoDemo {
	public static void main(String[] args) {
		UserDao ud = new UserDaoImpl();
		ud.add();
	}
}
