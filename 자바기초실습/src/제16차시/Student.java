package 제16차시;

public class Student {
	String name;
	int grade;
	public Student() {}
	public Student(String name) {
		this.name=name;
	}	
	public Student(String name,int grade) {
		this(name);
		this.grade=grade;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return this.grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}	
}
