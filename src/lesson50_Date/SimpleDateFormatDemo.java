package lesson50_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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