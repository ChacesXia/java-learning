package genericityclass;

public class Student {
	private String name;
	private int age;
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	public Student getStudent() {
		return new Student(this.name,this.age);
	}
}
