class Student{
	int num;
	String name;
	public void show(){
		System.out.println("���ѧ��������Ϊ��"+this.name);
	}
}

class StudentDemo{
	public void method(Student s){  //����Ϊһ���࣬�ڵ��ù�����Ϊһ������
		System.out.println("���ѧ���Ĵ���Ϊ��"+s.num);
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