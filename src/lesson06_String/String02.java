package lesson06_String;
/*
 *以下操作要不断断开已有的链接，重新指向信的链接，整体代码性能及其低，遇到此类代码绝对不要使用
 * */
public class String02 {
	public static void main(String[] args) {
		String str = "Hello";//使用直接赋值的方式完成
		
		for(int i=0;i<100;i++) {
			str += i;
		}
		System.out.println(str);
	}
}
