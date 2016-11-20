package com.study.method_rewrite;

/**
 * 方法重写：
 * 	子类中出现了与父类中名称相同的方法，也被称为方法覆盖或者方法复写
 * 	如果方法名不同，有就调用相应的方法；如果方法名相同，就调用子类的方法。
 * 注意事项：
 * 	1、父类方法中的私有方法不能被重写
 * 	2、子类重写父类方法时，访问权限不能更低
 * 	3、父类静态方法，子类必须通过静态方法进行重写。
 *
 */
class Father {
	public Father(){}
	public void sing(){
		System.out.println("Father is singing.....");
	}
}
class Son extends Father{
	public Son(){}
	public void sing(){
		System.out.println("Son is singing.....");
	}
	
}
public class RewriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.sing();

	}

}
