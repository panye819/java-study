package lesson28_WrapperClass;
/**
 * 包装类还可以将字符串变成基本数据类型
 *  但是，需要注意的是，字符串必须由数字组成，如果有非数字存在，则代码会出现错误。
 * */
public class WrapperClassDemo2 {
	public static void main(String[] args) {
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println("i : "+i);
	}

}
