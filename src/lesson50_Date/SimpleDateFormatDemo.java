package lesson50_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 * 
 * String -- Date(解析)
 * 		public Date parse(String source)
 * 
 * DateForamt:可以进行日期和字符串的格式化和解析，但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * 
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M	
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 */
public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt = new Date();
		System.out.println("date is :"+dt);
		System.out.println(dt.getTime());
		System.out.println("-------------------");
		
		//日期格式化
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = sdf.format(dt);
		System.out.println(s);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
		String s1 = sdf1.format(dt);
		System.out.println(s1);
		System.out.println("-------------------");
		//把一个字符串转换成日期
		//在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
		String str = "2016-12-01 22:18:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf2.parse(str);
		System.out.println(d);
	}

}