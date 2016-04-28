import java.util.Scanner;

class TestOne extends One{
  public static void main(String [] agrs){
    int number=0;
    Scanner sc=new Scanner(System.in);
    try{
      number=sc.nextInt();
    }catch(Exception e){
      System.out.println("input error");
    }
    
    TestOne testOne = new TestOne();
    testOne.set(number);
    System.out.println(testOne.get());
  }
}