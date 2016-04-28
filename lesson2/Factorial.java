class Test{
	public static int function (int i){
		int result=1;
		while(i>0){
			result*=i;
			i--;
		}
		return result;
	}
}

class Factorial{
	public static void main(String [] args){
		double out=0d;
		int i=1;
		while(i<=20){
			out+=1.0d/Test.function(i);
			i++;
			System.out.println("processing:"+out);
		}
		System.out.println("The result:"+out);
	}
}