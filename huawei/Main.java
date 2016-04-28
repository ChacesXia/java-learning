import java.util.*;  
public class Main  
{  
    public static void main(String args[])  
    {  
        //INSERT YOUR CODE HERE  
        Scanner cin=new Scanner(System.in);  
        int num =0;  
        num = cin.nextInt();   
        String s = Integer.toBinaryString(num);  
        int loop = 0;  
        System.out.println(s.length());
        for(int i=s.length();i>0;){  
            System.out.println(loop);  
            loop++;
            i--;
            if(s.charAt(i-1)!=0){  
                break;  
            }  
        }  
        System.out.println(loop);  
        System.out.println(s);  
        System.out.println(Math.pow(2,loop));  
  
    }  
}  