import java.io.File;


public class FileDemo4 {
//�����޸��ļ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("F:/test");
		String deleteText = "��˳ƽ.ѭ�򽥽�ѧ.java.�����ŵ���ͨ.";
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
