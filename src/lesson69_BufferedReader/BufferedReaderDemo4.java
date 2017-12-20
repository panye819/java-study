package lesson69_BufferedReader;

public class BufferedReaderDemo4 {
	public static void main(String[] args) throws Exception  {
		InputData input = new InputData();
		int i = input.getInt("请输入第一个数字", "输入的内容必须是数字，请重新输入");
		int j = input.getInt("请输入第二个数字", "输入的内容必须是数字，请重新输入");
		System.out.println("数字相加："+i+" + "+j+" 和为："+(i+j));
	}
}