package lesson60_File;

import java.io.File;



public class ListDirDemo {
	public static void main(String[] args) {
		File file = new File("/Users/castlepan/Downloads/demofile");
		list(file);
	
	}
	public static void list(File file) {
//		File list[] = file.listFiles();
//		for (int x=0;x<list.length;x++) {
//			if(list[x].isDirectory()) {
//				list(list[x]);
//			}else {
//				System.out.println(list[x]);
//			}
//		}
		if(file.isDirectory()) {
			File lists[] = file.listFiles();
			if (lists != null) {
				for (int x = 0; x < lists.length; x++) {
					list(lists[x]);
				}
			}
		}
		System.out.println(file);
			
	}	
}
