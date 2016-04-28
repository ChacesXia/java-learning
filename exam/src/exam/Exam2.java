import java.util.Scanner;
public class Main{
    public static void  main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        int studentNum=sc.nextInt();
        int oprateNum=sc.nextInt();
//        sc.nextLine();

        
        int sore[] =new int[studentNum];
        for(int i=0;i<studentNum;i++){
            sore[i]=sc.nextInt();
        }
		int qNum=0;
        int maxSore[] =new int[studentNum];
        for(int i=1;i<=oprateNum;i++){
            String oprate=sc.next();
            if(oprate.equals("Q")){
                int studentA = sc.nextInt();
                int studentB = sc.nextInt();
                
                int arr[] = new int[studentB-studentA+1];
                for(int index=0, j=studentA;j<studentB;j++,index++){
                    arr[index]=sore[j];
                }
                maxSore[qNum]=max(arr);
                qNum++;
            } else if(oprate.equals("U")){
                int studentA = sc.nextInt();
                int studentSore = sc.nextInt();
                sore[studentA] = studentSore;
            }
        }
        for(int i=1;i<maxSore.length;i++){
            System.out.println(maxSore[i]);
        }
    }
    public static int max(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>= max){
                max = arr[i];
            }
        }
        return max;
    }
}