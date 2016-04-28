import java.util.Scanner;
public class StringDemo5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine().toLowerCase();
        String input2 = sc.nextLine().toLowerCase();
        
        int num = 0;
        for(int i=0;i<input1.length();i++){
            String index = ((Character)(input1.charAt(i))).toString();
            if(index.equals(input2)){
                num++;
            }
        }
        System.out.println(num);
        
    }
}