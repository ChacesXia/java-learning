//1、创建两个个文件对象
//2、创建一个文件对象输入流
//3、将输入流read到字符数组中
//4、创建一个文件对象输出流，将输出流写到文件二中
import java.io.*;
import java.util.*;
public class CharStreamDemo{
	public static void copy(String pathname1,String pathname2) throws IOException{
		// 创建文件对象
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		// 创建文件流对象
		// FileReader input = new FileReader(file1);
		String s="";
		String temp = "";
		BufferedReader input = new BufferedReader(new FileReader(file1));
		BufferedWriter output = new BufferedWriter(new FileWriter(file2));
		StringBuilder out = new StringBuilder();
		while((temp = input.readLine()) != null){
			out.append(temp + "\n");
		}
		input.close();
		// System.out.println(out);
		String out2 = new String(out,"GBK");
		output.write(out.toString());
		output.close();

		System.out.println("复制完成："+out.length()+"kb");
	}
	public static void main(String[] args) throws IOException{
		// 在运行时候输入文件路径
		copy(args[0],args[1]);
	}
}