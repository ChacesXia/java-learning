class Rectangle{
  public float length, width;
  public Rectangle(){
    this.length=0;
    this.width=0;
    System.out.println("please input parameters");
  }
  public Rectangle(float length,float width){
    this.length=length;
    this.width=width;
  }
  public float area(){
    return this.length*this.width;
  }
  public float area(float length,float width){
    return length*width;
  }
}