import java.util.Scanner;
class T{
  public static void main(String[] args) {
    String arrStr [][] = new String[1000][3];
    int arrInt[][] = new int[1000][3];
    String ss[] =new String[1000];
    Scanner sc= new Scanner(System.in);
    
    int num=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<num;i++){
      ss[i]=sc.nextLine();
    }
    System.out.println("input end");
    for(int i=0;i<num;i++){
      arrStr[i]=ss[i].split(" ");
    }
    for(int i=0;i<num;++i){
      for(int j=0;j<3;++j){
        // System.out.println(arrStr[i][j]);
       arrInt[i][j]=Integer.parseInt(arrStr[i][j]);
       System.out.println(arrInt[i][j]);

      } 
    } 
    for(int i=0;i<num;i++){
      int chunk=0;
      while(true){
        if(arrInt[i][2]*chunk>=arrInt[i][0]&& arrInt[i][2]*chunk>=arrInt[i][1] && arrInt[i][2]*arrInt[i][2]>=arrInt[i][1]*arrInt[i][0]){
          break;
        }
        chunk++;
        break;
      }
      System.out.println(chunk);

    } 
  }
}