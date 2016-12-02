package com.study.day07_02_construction;
/**
 * @author bluebell325
 *定义一个demo类，其中定义一个求二个数据和的方法，
 *定义一个测试类Test，进行测试
 */

/**
 * 视频中不推荐的写法，因为成员变量并没有合适的描述类的属性，成员变量的范围越小越好，这样成员变量的可以被及时回收
 * class Demo{
	int a;
	int b;
//	int c = a+b;
	public int numAdd(int a,int b){
		return a+b;
		
	}
}
public class TestDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d.numAdd(5, 6));
	}

}
 *
 */
//修改版
class Demo{

//	int c = a+b;
	public int numAdd(int a,int b){
		return a+b;
		
	}
}
public class TestDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		System.out.println(d.numAdd(5, 6));
	}

}
