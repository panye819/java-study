package lesson05_constructor;
/*
 * */

class Student{
	private String name;
	private int age;
	private float math_score;
	private float compute_score;
	private float english_score;
//	private float score[] = {math_score,compute_score,english_score};	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getMath_score() {
		return math_score;
	}
	public void setMath_score(float math_score) {
		this.math_score = math_score;
	}
	public float getCompute_score() {
		return compute_score;
	}


	public void setCompute_score(float compute_score) {
		this.compute_score = compute_score;
	}


	public float getEnglish_score() {
		return english_score;
	}


	public void setEnglish_score(float english_score) {
		this.english_score = english_score;
	}
}
public class Constructor2 {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Tom"); 
		st1.setAge(20);
		st1.setEnglish_score(86);
		st1.setMath_score(91);
		st1.setCompute_score(62);
		
	}
}
