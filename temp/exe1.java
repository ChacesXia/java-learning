class A{
private int i;
public void seti(int i)
{
this.i=i;
}
public int geti()
{
return this.i;
} 
}



public class exe1{
	public static void main(String [] args){
A a=new A();
a.seti(4);
System.out.println("i="+a.geti());
}
}