// 设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”抽象类，使用继承将这些图形分类，并创建类对象。可以自由发挥，不需要可虑实现细节，主要了解抽象类的的实现思想方法。
//抽象类
public abstract class Graph{
  private String graphName;
  public void setGraphName (String name) {
    this.graphName=name;
  }
  public String getGraphName () {
    return this.graphName;
  }
  public abstract float area ();
  public abstract float perimeter ();
}