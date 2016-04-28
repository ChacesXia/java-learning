import java.util.Scanner;
class Loop{
  public static void main(String[] args) {

    int i=0;
    Scanner sc=new Scanner();
    System.out.print("please input you want to print symbol:");
    try{
      i=sc.nextInt();
    }catch(Exception e){
      System.out.println("input error");
    }
    System.out.println("you input parameters number is "+args.length);
    for (int j=0;j<args.length ;j++ ) {
      System.out.print(i);
    }
  }
}