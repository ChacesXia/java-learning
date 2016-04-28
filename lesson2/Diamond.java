import java.util.Scanner;

class Print{
	public static void hollowPrint(int height,int i){
		// space control
		for (int j=0;j<height-i ;j++ ) {
			System.out.print(" ");
		}
		System.out.print("*");
		// space control
		for (int j=0; j<2*(i-2)+1; j++) {
			System.out.print(" ");
		}
		if (i!=1) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void soildPrint(int height,int i){
		for (int j=0;j<height-i ;j++ ) {
			System.out.print(" ");
		}
		for (int j=0; j<2*i-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

class Diamond{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("please input length:");
		int height=0;
		try{
			height=sc.nextInt();
		}catch(Exception e){
			System.out.println("input error");
		}
		// print hollow diamond
		for (int i=1;i<=height;i++) {
			Print.hollowPrint(height,i);
		}
		for (int i=height-1; i>0;i-- ) {
			Print.hollowPrint(height,i);
		}
		System.out.println("----------------------");
		// print soild diamond
		for (int i=1;i<=height;i++) {
			Print.soildPrint(height,i);
		}
		for (int i=height-1; i>0;i-- ) {
			Print.soildPrint(height,i);
		}

	}

}