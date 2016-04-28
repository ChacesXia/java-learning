class Student{
	int num;
	String name;
	public void show(){
		System.out.println("这个学生的名称为："+this.name);
	}
}

class StudentDemo{
	public void method(Student s){  //参数为一个类，在调用过程中为一个对象
		System.out.println("这个学生的代号为："+s.num);
		s.show();
	}
}

class Test{
	public static void main(String[] args){
		Student stu=new Student();
		
		stu.num=110;
		stu.name="jack";
		
		stu.show();
		
		StudentDemo stuDemo=new StudentDemo();
		
		stuDemo.method(stu);
	}
}