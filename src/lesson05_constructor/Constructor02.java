package lesson05_constructor;
/*
 * */

class Student{
	private String name;
	private int age;
	private float math_score;
	private float compute_score;
	private float english_score;
	public Student() {}
	public Student(String name,int age,float math_score,float compute_score,float english_score) {
		this.setName(name);
		this.setAge(age);
		this.setCompute_score(compute_score);
		this.setEnglish_score(english_score);
		this.setMath_score(math_score);
	}
	public float sum() {
		return math_score+english_score+compute_score;
	}
	public float avg() {
		return this.sum()/3;
	}
	public float max() {
		float max = compute_score>math_score?compute_score:math_score;
		max = max>english_score?max:english_score;
		return max;
	}
	public float min() {
		float min = compute_score<math_score?compute_score:math_score;
		min = min<english_score?min:english_score;
		return min;
	}
	public String getInfo() {
		return  "学生信息： \n"+
				"\t|- 姓名： "+this.getName()+"\n" +
				"\t|- 年龄： "+this.getAge()+"\n"+
				"\t|- 数学分数： "+this.getMath_score()+"\n"+
				"\t|- 电脑分数： "+this.getCompute_score()+"\n"+
				"\t|- 英语分数： "+this.getEnglish_score()+"\n"+
				"\t|- 总分： "+this.sum()+"\n"+
				"\t|- 平均分： "+this.avg()+"\n"+
				"\t|- 最高分： "+this.max()+"\n"+
				"\t|- 最低分： "+this.min()+"\n";
	}
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
		Student st1 = new Student("Tom",19,84.0f,91.0f,75.0f);
		System.out.println(st1.getInfo());
		
		
	}
}
