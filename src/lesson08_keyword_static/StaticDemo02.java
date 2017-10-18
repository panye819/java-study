package lesson08_keyword_static;
/*
 *  主方法上也存在static关键字，那么主方法的含义是什么？
 *  	public static void main(String args[])
 *  		public：表示最大的权限，所有人都可以访问
 *  		static：因为执行的时候是类名称，所以表示可以由类名称直接调用
 *  		void：因为主方法是一切的起点，所以表示没有返回值
 *  		main：系统内建的方法名称
 *  		String args[]：表示字符串数组，用于接收参数
 *  
 *  程序的内存划分：
 *  		1、栈内存：对象名称，实际上是对象对堆的引用地址
 *  		2、堆内存：属性
 *  		3、全局代码区：保存所有的操作方法
 *  		4、全局数据区：保存所有的static属性
 * */
public class StaticDemo02 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]+"、");
		}
	}
}
