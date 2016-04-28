import java.util.Scanner;

class TestRectangle{
  public static void main(String[] args) {
    float length=0f;
    float width = 0f;
    Scanner sc=new Scanner(System.in);
    System.out.println("please input length and width:");
    try{
      length=sc.nextFloat();
      width=sc.nextFloat();
    }catch(Exception e){
      System.out.println("input error");
    }
    Rectangle r=new Rectangle(length,width);
    System.out.println(r.area());
  }
}