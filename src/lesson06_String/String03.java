package lesson06_String;
/*
 * 	字符串的判断功能
 * 		
 */
public class String03 {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "ABC";
		String s2 = "abcdef";
		String s4 = "";
		
		//判断功能
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2.contains(s));
		System.out.println(s.startsWith("a"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.endsWith("c"));
		System.out.println(s2.endsWith("c"));
		System.out.println(s2.isEmpty());
		System.out.println(s4.isEmpty());
		
		
		
		
	}

}