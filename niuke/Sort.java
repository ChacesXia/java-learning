import java.util.Scanner;
import java.util.Arrays;
public class Sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int arr[] =new int[num];
        
        for(int i=0;i<num;i++){
        	arr[i]=sc.nextInt();    
        }
        
        Arrays.sort(arr);
        System.out.println(arr[0]);
        for(int i=1;i<num;i++){
            if(arr[i]==arr[i-1]){
                continue;
            } else if(arr[i]==0){
                break;
            }
            System.out.println(arr[i]);
        }
    }
}