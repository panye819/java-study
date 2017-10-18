package lesson08_keyword_static;
/*
 * 程序的开发思路：
 * 	1、完成基本功能
 * 	2、改善功能，加入一些验证
 * 	3、形成更好的结构，加入一些类的设计
 * 	4、主方法中不能编写过多代码
 * */
public class StaticDemo03 {
	public static void main(String[] args) {
		String name = args[0];
		String password = args[1];
		if(name.equals("admin")&&password.equals("admin")) {
			System.out.println("登陆成功！！");
		}else {
			System.out.println("登陆失败！请重试！！");
		}
	}
}
