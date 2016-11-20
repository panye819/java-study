package com.study.day09_01;
/**
 * @author bluebell325
 *定义一个长方形类，其中定义求周长和面积的方法，
 *定义一个测试类Test1，进行测试
 */
class Rectangle{
	int a;
	int b;
	public int rectanglePerimeter(int a,int b){
		return (a+b)*2;		
	}
	public int rectangleAcreage(int a,int b){
		return a*b;
	}
}
public class TestDemo1 {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		System.out.println("rectanglePerimeter is : "+r.rectanglePerimeter(5,6));
		System.out.println("rectangleAcreage is : "+r.rectangleAcreage(5,6));
	}

}
