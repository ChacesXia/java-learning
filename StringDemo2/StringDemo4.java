import java.util.Scanner;
public class StringDemo4{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    String [] sArr = s.split(" ");
    for (String ss :sArr ) {
      System.out.println(ss);
    }
    System.out.println(sArr[1]);
    String out = sArr[sArr.length-1];
    System.out.println(out.length());
}
}