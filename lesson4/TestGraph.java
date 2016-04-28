class TestGraph {
  public static void main(String[] args) {
    //三角形
    Triangle triangle1 = new Triangle(10,10,10);
    System.out.println("triangle1's area is: "+ triangle1.area());
    System.out.println("triangle1's perimeter is: "+ triangle1.perimeter());
    //矩形
    Rectangle rectangle1  = new Rectangle(15,10);
    System.out.println("rectangle1's area is: "+ rectangle1.area());
    System.out.println("rectangle1's perimeter is: "+ rectangle1.perimeter());    
    //圆形
    Roundness roundness1  = new Roundness(20);
    System.out.println("roundness1's area is: "+ roundness1.area());
    System.out.println("roundness1's perimeter is: "+ roundness1.perimeter());
    //椭圆
    Ellipse ellipse1  = new Ellipse(20,10);
    System.out.println("ellipse1's area is: "+ ellipse1.area());
    System.out.println("ellipse1's perimeter is: "+ ellipse1.perimeter());
  }
}