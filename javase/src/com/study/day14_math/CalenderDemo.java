package com.study.day14_math;

import java.util.Calendar;

/**
 *
 */
public class CalenderDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int mon  = c.get(Calendar.MONTH);
		int day  = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("year is : "+year);
		System.out.println("month is :"+(c.get(Calendar.MONTH)+1));//month�Ǵ�0��ʼ������Ҫ+1
		System.out.println("day is : "+c.get(Calendar.DAY_OF_MONTH));
		
//		c.add(Calendar.YEAR, -3);
//		year = c.get(Calendar.YEAR);
//		mon = c.get(Calendar.MONTH);
//		day = c.get(Calendar.DAY_OF_MONTH);
//		System.out.println(year+"��"+(mon+1)+"��"+day+"��");
		 
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DAY_OF_MONTH, -10);
		year = c.get(Calendar.YEAR);
		mon = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��"+(mon+1)+"��"+day+"��");
		
	}

	
	

}
