package lesson50_Date;
import java.util.Calendar;
/**
 * */
import java.util.Date;


public class DateDemo {
	public static void main(String[] args) {
		System.out.println(new Date());
		System.out.println("------------");
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int mon  = c.get(Calendar.MONTH);
		int day  = c.get(Calendar.DAY_OF_MONTH);
		System.out.println("year is : "+year);
		System.out.println("month is :"+(c.get(Calendar.MONTH)+1));//month是从0开始，所以要+1
		System.out.println("day is : "+c.get(Calendar.DAY_OF_MONTH));
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DAY_OF_MONTH, -10);
		year = c.get(Calendar.YEAR);
		mon = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年"+(mon+1)+"月"+day+"日");

	}

}
