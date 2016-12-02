import java.io.File;


public class FileDemo4 {
//批量修改文件
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("F:/test");
		String deleteText = "韩顺平.循序渐进学.java.从入门到精通.";
		File[] fs = dir.listFiles();
		for (File file : fs) {
//			System.out.println(file);
			if(file.getName().contains(deleteText)){
				String newFileName = file.getName().replace(deleteText,"");
				file.renameTo(new File(dir,newFileName));
//				file.getName().replace(, replacement)
			}
			
		}
		
	}

}
