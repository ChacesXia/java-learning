/*
	è��
		��Ա���������������䡢��ɫ
		���췽�����޲κ��в�
		��Ա������
			getxxx �� set xxx
			�ԣ�����
			�棨����	
	����
		��Ա���������������䡢��ɫ
		���췽�����޲κ��в�
		��Ա������
			getxxx �� set xxx
			�ԣ�����
			���ţ�����
	���
		��Ա���������������䡢��ɫ
		���췽�����޲κ��в�
		��Ա������getxxx �� set xxx
			�ԣ�����
		
		è��
			���췽�����в��޲�
			��Ա�������棨��
		����
			���췽�����в��޲�
			��Ա���������ţ���
*/
class Animal{
	private String name;
	private int age;
	private String color;
	public Animal(){
		
	}
	public Animal(String name,int age,String color){
		this.name=name;
		this.age=age;
		this.color=color;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getColor(){
		return color;
	}
	public void eat(){
		System.out.println(this.name+"���ڳԶ���");
	}
}

class Cat extends Animal{
	public Cat(){
		
	}
	public Cat(String name,int age,String color){
		super(name,age,color);
	}
	public void play(){
		System.out.println("è������");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age, String color){
		super(name,age,color);
	}
	public void lookDoor(){
		System.out.println(super.getName()+"�����ڿ�����");
	}
}

class AnimalDemo{
	public static void main(String[] args){
		
		Cat c=new Cat("Tom",3,"��ɫ");
		c.play();
		System.out.println(c.getName()+"è�������ǣ�"+c.getAge()+"����ɫ�ǣ�"+c.getColor());
		System.out.println("----------------------------------");
		
		Dog d=new Dog();
		d.setName("����");
		d.setAge(4);
		d.setColor("��ɫ");
		d.lookDoor();
		System.out.println(d.getName()+"���������ǣ�"+d.getAge()+"����ɫ�ǣ�"+d.getColor());
		
	}
}