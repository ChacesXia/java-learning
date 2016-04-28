/*
	猫：
		成员变量：姓名、年龄、颜色
		构造方法：无参和有参
		成员方法：
			getxxx 和 set xxx
			吃（）；
			玩（）；	
	狗：
		成员变量：姓名、年龄、颜色
		构造方法：无参和有参
		成员方法：
			getxxx 和 set xxx
			吃（）；
			看门（）；
	动物：
		成员变量：姓名、年龄、颜色
		构造方法：无参和有参
		成员方法：getxxx 和 set xxx
			吃（）；
		
		猫：
			构造方法：有参无参
			成员方法：玩（）
		狗：
			构造方法：有参无参
			成员方法：看门（）
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
		System.out.println(this.name+"正在吃东西");
	}
}

class Cat extends Animal{
	public Cat(){
		
	}
	public Cat(String name,int age,String color){
		super(name,age,color);
	}
	public void play(){
		System.out.println("猫正在玩");
	}
}
class Dog extends Animal{
	public Dog(){}
	public Dog(String name,int age, String color){
		super(name,age,color);
	}
	public void lookDoor(){
		System.out.println(super.getName()+"狗正在看门中");
	}
}

class AnimalDemo{
	public static void main(String[] args){
		
		Cat c=new Cat("Tom",3,"白色");
		c.play();
		System.out.println(c.getName()+"猫的年龄是："+c.getAge()+"，颜色是："+c.getColor());
		System.out.println("----------------------------------");
		
		Dog d=new Dog();
		d.setName("花花");
		d.setAge(4);
		d.setColor("花色");
		d.lookDoor();
		System.out.println(d.getName()+"狗的年龄是："+d.getAge()+"，颜色是："+d.getColor());
		
	}
}