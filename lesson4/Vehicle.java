//创建一个接口vehicle，在接口中添加带有一个参数的方法star()和stop（）。在类bike和bus中实现接口vehicle。创建一个类interfacedemo，在此类中创建bike和bus的对象，并访问star（）和stop（）方法。
public interface Vehicle {
  public abstract void star (float f1);
  public abstract void stop (float f1);
}