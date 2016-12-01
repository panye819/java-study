package com.study.day13_StringBuffer;

/**
 * 	StringBuffer
 * 		对字符串进行拼接时，每次都会创建一个新的对象，既耗时又浪费空间。
 * 		StringBuffer是一个线程安全的可变序列。
 * 		构造方法：
 * 			StringBuffer() 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。 
 *			StringBuffer(CharSequence seq) 
 *         		public java.lang.StringBuilder(CharSequence seq) 构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。 
 *			StringBuffer(int capacity) 构造一个不带字符，但具有指定初始容量的字符串缓冲区。 
 *			StringBuffer(String str) 构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。 
 *		添加数据：
 *			append,追加元素到字符串缓冲区的末尾
 *			insert,追加元素到字符串缓冲区指定索引值位置
 *		删除数据：
 *			delete charAt(int index)删除指定索引值位置的字符
 *			delete (int start,int end)删除从指定索引值开始到指定索引值结束之间的字符
 *		替换功能：
 *			replace(int start,int end,String str)
 *		反转字符串：
 *			reverse
 *		截取功能：
 *			public String subString(int start)
 *			public String subString(int start,int end)	
 *			注意：返回值类型是String而不是上面的StringBuffer
 *		
 */
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1.append("hello");//将任意类型的数据添加到字符串缓冲区里，并返回字符串缓冲区本身
		System.out.println("sb1 is : "+sb1);
		System.out.println("sb2 is : "+sb2);
		System.out.println(sb1 == sb2);//说明这里调用的是sb1本身
		
		sb.insert(0, "n");
		System.out.println("after: "+sb);
		
		StringBuffer sb3 = new StringBuffer("abcdefg");
		System.out.println("before : "+sb3);
		sb3.deleteCharAt(0);
		System.out.println("after : "+sb3);
		sb3.delete(0, 2);//包左不包右
		System.out.println("after : "+sb3);
		System.out.println("-------------");
		StringBuffer sb4 = new StringBuffer("abcdefg");
		System.out.println(sb4.delete(0, sb4.length()));
		System.out.println("-------------");
		StringBuffer sb5 = new StringBuffer("abcdefg");
		System.out.println(sb5.replace(0, 4, "hijklmn"));
		System.out.println(sb5.reverse());
		StringBuffer sb6 = new StringBuffer("abcdefg");
		System.out.println(sb6.substring(4));
		System.out.println(sb6.substring(0, 4));
		
	}

}
