import java.util.Scanner;
public class Drink{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        int num =0;
        do{
            arr[num]= sc.nextInt();
            num++;
        }while(sc.nextInt()==0);

        for(int x:arr){
            if(x!=0){
                System.out.println(x/2);
            }else{
                break;
            }
            
        }
    }
}