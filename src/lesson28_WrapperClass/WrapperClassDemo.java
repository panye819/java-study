package lesson28_WrapperClass;
/**
 * 包装类:
 * 	在Java中，针对八种基本数据类型，设置了八个包装类，用于以类的形式表示出基本数据类型
 * 	这八种包装类中实际分为以下两组：
 * 		1、数值型：Integer、Byte、Short、Float、Double、Long
 * 				上面的都是num的子类，返回值类型都是基本数据类型。
 * 		2、其他类型：Character、Boolean
 * 在包装类的操作中存在装箱和拆箱操作：
 * 		1、装箱操作：将基本数据类型变成包装类
 * 		2、拆箱操作：将包装类变为基本数据类型
 * */
public class WrapperClassDemo {
	public static void main(String[] args) {
		int i = 10;
		Integer i2 = new Integer(i);//装箱操作
		int j = i2.intValue();//拆箱操作
		System.out.println("j * j = "+(j*j));
		System.out.println("--------------");
		
		float f1 = 10.3f;
		Float f2 = new Float(f1);
		float f3 = f2.floatValue();
		System.out.println("f3 * f3 = "+(f3*f3));
		System.out.println("--------------");
		//以上的做法实在JDK1.5之前的，在JDK1.5之前所有的数据必须进行手工的装箱及拆箱操作，
		//而且包装类本身不能进行任何的数学运算，如：包装类对象++。
		
		//但是在JDK1.5之后，增加了自动装箱及拆箱操作
		int i11 = 100;
		Integer i21 = i11;//自动装箱
		int i12 = i21;//自动拆箱
		System.out.println("i12 * i12 = "+(i12*i12));
		System.out.println("--------------");
		//通过包装类也可以取得最大值和最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		 
		
	}

}
