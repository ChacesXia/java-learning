package exam;
import java.util.Scanner;

class Exam {
	public static void main(String[] args) {
		String arr [][] = new String[1000][3];
		int arrint[][] = new int[1000][3];
		String ss[] =new String[1000];
		Scanner sc= new Scanner(System.in);
		
		int num=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<num;i++){
			ss[i]=sc.nextLine();
			// java 的next方法竟然不能读入空格。
//			System.out.println(ss[i]);
		}
		for(int i=0;i<num;i++){
			arr[i]=ss[i].split(" ");
		}
		for(int i=0;i<num;++i){
			for(int j=0;j<3;++j){
//				System.out.println(arr[i][j]);
				arrint[i][j]=Integer.parseInt(arr[i][j]);
			}	
		}	
		for(int i=0;i<num;i++){
			int chunk=0;
			while(true){
				if(arrint[i][2]*chunk>=arrint[i][0]&& arrint[i][2]*chunk>=arrint[i][1] && arrint[i][2]*arrint[i][2]>=arrint[i][1]*arrint[i][0]){
					System.out.println(chunk);
					break;
				}
				chunk++;
			}
		}	
		
	}

}
