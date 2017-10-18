package lesson07_keyword_this;
/*
 *
 * */
class Person1{
	public void print() {
		System.out.println(this);
	}
}

public class ThisDemo02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 per1 = new Person1();
		Person1 per2 = new Person1();
		System.out.println(per1);
		per1.print();
		System.out.println("------------------");
		System.out.println(per2);
		per2.print();
	}

}
