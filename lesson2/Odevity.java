import java.util.Scanner;
class Odevity{
	public static void main(String [] agrs){
		Scanner sc=new Scanner(System.in);
		System.out.println("please input a number fot test! input 0 and you can exit!");
		while(true){
			try{
				int i=sc.nextInt();
				if (i==0) {
					break;
				}
				if(i%2==0){
					System.out.println("your input is "+i+",This is a even number");
				}else{
					System.out.println("your input is "+i+",This is a odd number");
				}
			}catch(Exception e){
					System.out.println("input is error! please run again");
					break;
			}

		}
	}
}