package lesson80_Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorDemo {
public static void main(String[] args) {
	List<String> allList = new ArrayList<String>();
	allList.add("A");
	allList.add("B");
	allList.add("C");
	allList.add("D");
	allList.add("E");
	Iterator<String> iter = allList.iterator();
	while(iter.hasNext()) {
		String str = iter.next();
		if("C".equals(str)) {
			iter.remove();
//			allList.remove(str);
			/**这里不能使用allList.remove()方法删除元素，因为这样会破坏整个集合的内容
			 * Iterator无法处理异常，会产生错误。
			 * 所以在实际的开发中是很少使用Iterator进行删除操作的，只是判断是否有值并且将值输出。
			 * */
		}
		System.out.print(str+"、");	
	}
	System.out.println("删除之后的集合："+allList);
	
}
}
